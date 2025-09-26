package org.tabelaFIPE.Fipe;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Marca {
    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("modelo")
    private Modelo modelo;
    @JsonProperty("ano")
    private Ano ano;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }
}
