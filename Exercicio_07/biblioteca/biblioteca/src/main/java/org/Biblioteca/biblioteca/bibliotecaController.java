package org.Biblioteca.biblioteca;

import org.Biblioteca.biblioteca.livro;
import org.Biblioteca.biblioteca.emprestimo;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class bibliotecaController {

    private final List<livro> livrosDisponiveis = new ArrayList<>();
    private final List<emprestimo> emprestimosAtivos = new ArrayList<>();

    public bibliotecaController() {
        // Inicializar livros
        livrosDisponiveis.add(new livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        livrosDisponiveis.add(new livro("1984", "George Orwell"));
        livrosDisponiveis.add(new livro("Dom Casmurro", "Machado de Assis"));
        livrosDisponiveis.add(new livro("Harry Potter", "J.K. Rowling"));
    }

    @GetMapping("/livros")
    public List<livro> getLivrosDisponiveis() {
        return livrosDisponiveis;
    }

    @GetMapping("/emprestados")
    public List<emprestimo> getEmprestimos() {
        return emprestimosAtivos;
    }

    @PostMapping("/emprestados")
    public String emprestarLivro(@RequestBody Map<String, String> payload) {
        UUID livroId = UUID.fromString(payload.get("livroId"));
        String usuarioId = payload.get("usuarioId");

        Optional<livro> livroOptional = livrosDisponiveis.stream()
                .filter(l -> l.getId().equals(livroId))
                .findFirst();

        if (livroOptional.isPresent()) {
            livrosDisponiveis.remove(livroOptional.get());
            emprestimo emprestimo = new emprestimo(livroId, usuarioId);
            emprestimosAtivos.add(emprestimo);
            return "Empréstimo realizado com sucesso! ID: " + emprestimo.getEmprestimoId();
        } else {
            return "Livro não encontrado ou já emprestado.";
        }
    }

    @DeleteMapping("/emprestados/{emprestimoId}")
    public String devolverLivro(@PathVariable UUID emprestimoId) {
        Optional<emprestimo> emprestimoOptional = emprestimosAtivos.stream()
                .filter(e -> e.getEmprestimoId().equals(emprestimoId))
                .findFirst();

        if (emprestimoOptional.isPresent()) {
            emprestimo emprestimo = emprestimoOptional.get();
            UUID livroId = emprestimo.getLivroId();

            // Simula re-obtenção do livro (em sistemas reais, buscaríamos do banco)
            livro livro = new livro();
            livro.setId(livroId);  // Usando o mesmo ID
            livro.setTitulo("Livro devolvido"); // Título não conhecido aqui
            livro.setAutor("Autor desconhecido");

            livrosDisponiveis.add(livro);
            emprestimosAtivos.remove(emprestimo);
            return "Livro devolvido com sucesso.";
        } else {
            return "Empréstimo não encontrado.";
        }
    }
}
