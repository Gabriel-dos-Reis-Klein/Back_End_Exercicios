package org.Biblioteca.biblioteca;

import java.time.LocalDateTime;
import java.util.UUID;

public class emprestimo {
    private UUID emprestimoId;
    private UUID livroId;
    private String usuarioId;
    private LocalDateTime dataEmprestimo;

    public emprestimo() {}

    public emprestimo(UUID livroId, String usuarioId) {
        this.emprestimoId = UUID.randomUUID();
        this.livroId = livroId;
        this.usuarioId = usuarioId;
        this.dataEmprestimo = LocalDateTime.now();
    }

    // Getters e setters
    public UUID getEmprestimoId() { return emprestimoId; }
    public void setEmprestimoId(UUID emprestimoId) { this.emprestimoId = emprestimoId; }

    public UUID getLivroId() { return livroId; }
    public void setLivroId(UUID livroId) { this.livroId = livroId; }

    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }

    public LocalDateTime getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(LocalDateTime dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }
}
