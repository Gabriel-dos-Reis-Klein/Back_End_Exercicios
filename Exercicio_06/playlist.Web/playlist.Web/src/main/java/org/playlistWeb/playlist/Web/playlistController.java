package org.playlistWeb.playlist.Web;

import org.playlistWeb.playlist.Web.musica;
import org.playlistWeb.playlist.Web.playlist;
import org.playlistWeb.playlist.Web.playlistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/playlists")
public class playlistController {

    private final playlistService playlistService;

    public playlistController(playlistService playlistService) {
        this.playlistService = playlistService;
    }

    // Criar uma nova playlist
    @PostMapping
    public Map<String, Integer> criarPlaylist(@RequestBody playlist playlist) {
        int id = playlistService.criarPlaylist(playlist.getNome());
        return Map.of("id", id);
    }

    // Adicionar música a uma playlist existente
    @PostMapping("/{id}/musicas")
    public String adicionarMusica(@PathVariable int id, @RequestBody musica musica) {
        boolean sucesso = playlistService.adicionarMusica(id, musica);
        if (sucesso) {
            return "Música adicionada com sucesso à playlist " + id;
        } else {
            return "Playlist não encontrada!";
        }
    }

    // Listar todas as playlists
    @GetMapping
    public List<playlist> listarPlaylists() {
        return playlistService.listarPlaylists();
    }

    // Listar músicas de uma playlist
    @GetMapping("/{id}/musicas")
    public List<musica> listarMusicas(@PathVariable int id) {
        return playlistService.listarMusicas(id);
    }
}
