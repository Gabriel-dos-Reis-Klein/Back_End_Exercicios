package org.Twitter.usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class usuario {
    private UUID id;
    private String nome;
    private String email;
    private List<tweet> tweets;

    public usuario() {
        this.id = UUID.randomUUID();
        this.tweets = new ArrayList<>();
    }

    public usuario(String nome, String email) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
        this.tweets = new ArrayList<>();
    }

    // Getters e setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<tweet> getTweets() { return tweets; }
    public void setTweets(List<tweet> tweets) { this.tweets = tweets; }
}
