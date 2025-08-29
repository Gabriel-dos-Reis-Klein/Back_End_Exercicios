package org.example;

import java.util.Scanner;

public class Spotify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicCloud cloud = new MusicCloud();

        System.out.print("Digite o nome da sua playlist: ");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        while (true) {
            System.out.print("\nDigite o nome da música (ou 'sair' para encerrar): ");
            String titulo = scanner.nextLine();

            if (titulo.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Musica musica = cloud.buscarMusica(titulo);
                playlist.adicionarMusica(musica);
                System.out.println("Você adicionou a música " + musica.getTitulo() + " na playlist.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Exibe a playlist
        playlist.imprimirPlaylist();
    }
}
