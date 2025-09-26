package org.tabelaFIPE.Fipe;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Modelo {
    @JsonProperty("modelo")
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
