package org.Twitter.usuario;

import java.time.LocalDateTime;
import java.util.UUID;

public class tweet {
    private UUID tweetId;
    private String mensagem;
    private boolean editado;
    private LocalDateTime dataCriacao;

    public tweet() {}

    public tweet(String mensagem) {
        this.tweetId = UUID.randomUUID();
        this.mensagem = mensagem;
        this.editado = false;
        this.dataCriacao = LocalDateTime.now();
    }

    // Getters e setters
    public UUID getTweetId() { return tweetId; }
    public void setTweetId(UUID tweetId) { this.tweetId = tweetId; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public boolean isEditado() { return editado; }
    public void setEditado(boolean editado) { this.editado = editado; }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao; }
}