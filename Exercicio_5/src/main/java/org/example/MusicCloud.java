package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private List<Musica> musicasDisponiveis;

    public MusicCloud() {
        musicasDisponiveis = new ArrayList<>();
        // Adicionando músicas
        musicasDisponiveis.add(new Musica("Macarena", "Los Del Rio"));
        musicasDisponiveis.add(new Musica("Evidências", "Chitãozinho & Xororó"));
        musicasDisponiveis.add(new Musica("Shape of You", "Ed Sheeran"));
        musicasDisponiveis.add(new Musica("Blinding Lights", "The Weeknd"));
        musicasDisponiveis.add(new Musica("As It Was", "Harry Styles"));
    }

    public Musica buscarMusica(String titulo) throws Exception {
        for (Musica m : musicasDisponiveis) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        throw new Exception("A música " + titulo + " não foi encontrada no sistema.");
    }
}

