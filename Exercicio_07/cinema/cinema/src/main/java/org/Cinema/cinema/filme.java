package org.Cinema.cinema;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class filme {
    private UUID id;
    private String titulo;
    private String genero;
    private int capacidade;
    private int assentosOcupados;
    private List<ingresso> ingressos;

    public filme() {
        this.id = UUID.randomUUID();
        this.ingressos = new ArrayList<>();
    }

    public filme(String titulo, String genero, int capacidade) {
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.genero = genero;
        this.capacidade = capacidade;
        this.assentosOcupados = 0;
        this.ingressos = new ArrayList<>();
    }

    // Getters e setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public int getAssentosOcupados() { return assentosOcupados; }
    public void setAssentosOcupados(int assentosOcupados) { this.assentosOcupados = assentosOcupados; }

    public List<ingresso> getIngressos() { return ingressos; }
    public void setIngressos(List<ingresso> ingressos) { this.ingressos = ingressos; }
}