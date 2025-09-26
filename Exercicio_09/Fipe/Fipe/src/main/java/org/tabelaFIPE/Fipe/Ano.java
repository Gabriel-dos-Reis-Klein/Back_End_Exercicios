package org.tabelaFIPE.Fipe;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ano {
    @JsonProperty("ano")
    private String ano;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
