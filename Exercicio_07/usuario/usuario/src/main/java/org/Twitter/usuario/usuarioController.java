package org.Twitter.usuario;


import org.Twitter.usuario.tweet;
import org.Twitter.usuario.usuario;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/usuarios")
public class usuarioController {

    private final List<usuario> usuarios = new ArrayList<>();

    public usuarioController() {
        // Inicializa alguns usuários
        usuarios.add(new usuario("Alice", "alice@email.com"));
        usuarios.add(new usuario("Bob", "bob@email.com"));
        usuarios.add(new usuario("Carlos", "carlos@email.com"));
    }

    // GET /usuarios
    @GetMapping
    public List<usuario> getUsuarios() {
        return usuarios;
    }

    // GET /usuarios/{id}/tweets
    @GetMapping("/{id}/tweets")
    public List<tweet> getTweets(@PathVariable UUID id) {
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .map(usuario::getTweets)
                .orElse(Collections.emptyList());
    }

    // POST /usuarios/{id}/tweets
    @PostMapping("/{id}/tweets")
    public String criarTweet(@PathVariable UUID id, @RequestBody Map<String, String> payload) {
        String mensagem = payload.get("mensagem");
        Optional<usuario> usuario = usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();

        if (usuario.isPresent()) {
            tweet tweet = new tweet(mensagem);
            usuario.get().getTweets().add(tweet);
            return "Tweet criado com sucesso! ID: " + tweet.getTweetId();
        } else {
            return "Usuário não encontrado.";
        }
    }

    // PATCH /usuarios/{id}/tweets/{tweetId}
    @PatchMapping("/{id}/tweets/{tweetId}")
    public String editarTweet(@PathVariable UUID id,
                              @PathVariable UUID tweetId,
                              @RequestBody Map<String, String> payload) {
        String novaMensagem = payload.get("mensagem");

        Optional<usuario> usuario = usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();

        if (usuario.isPresent()) {
            Optional<tweet> tweet = usuario.get().getTweets().stream()
                    .filter(t -> t.getTweetId().equals(tweetId))
                    .findFirst();

            if (tweet.isPresent()) {
                tweet t = tweet.get();
                t.setMensagem(novaMensagem);
                t.setEditado(true);
                return "Tweet editado com sucesso.";
            } else {
                return "Tweet não encontrado.";
            }
        } else {
            return "Usuário não encontrado.";
        }
    }

    // DELETE /usuarios/{id}/tweets/{tweetId}
    @DeleteMapping("/{id}/tweets/{tweetId}")
    public String deletarTweet(@PathVariable UUID id, @PathVariable UUID tweetId) {
        Optional<usuario> usuario = usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();

        if (usuario.isPresent()) {
            boolean removido = usuario.get().getTweets().removeIf(t -> t.getTweetId().equals(tweetId));
            return removido ? "Tweet deletado com sucesso." : "Tweet não encontrado.";
        } else {
            return "Usuário não encontrado.";
        }
    }
}
