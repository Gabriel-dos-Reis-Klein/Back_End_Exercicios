package org.Biblioteca.biblioteca;

import java.util.UUID;

public class livro {
    private UUID id;
    private String titulo;
    private String autor;

    public livro() {}

    public livro(String titulo, String autor) {
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters e setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
}
