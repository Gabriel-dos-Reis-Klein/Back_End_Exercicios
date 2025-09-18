package org.playlistWeb.playlist.Web;

import java.util.ArrayList;
import java.util.List;

public class playlist {
    private int id;
    private String nome;
    private List<musica> musicas = new ArrayList<>();

    public playlist() {}

    public playlist(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<musica> getMusicas() { return musicas; }
    public void setMusicas(List<musica> musicas) { this.musicas = musicas; }
}