package org.example;

import java.util.Scanner;

public class Internet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Tipo (texto, imagem, video): ");
        String tipoStr = scanner.nextLine().toUpperCase();

        TipoPostagem tipo;
        try {
            tipo = TipoPostagem.valueOf(tipoStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo inválido. Use: texto, imagem ou video.");
            return;
        }

        Postagem postagem = new Postagem(titulo, descricao, tipo);

        // Instâncias das plataformas
        PlataformaSocial myBook = new MyBook();
        PlataformaSocial fotogram = new Fotogram();
        PlataformaSocial anyTube = new AnyTube();

        // Compartilhar com MyBook
        try {
            if (tipo == TipoPostagem.TEXTO) {
                myBook.compartilharPostagem(postagem);
            } else if (tipo == TipoPostagem.IMAGEM) {
                myBook.compartilharImagem(postagem);
            } else {
                myBook.compartilharVideo(postagem);
            }
        } catch (Exception e) {
            System.out.println("Erro no MyBook: " + e.getMessage());
        }

        // Compartilhar com Fotogram
        try {
            if (tipo == TipoPostagem.TEXTO) {
                fotogram.compartilharPostagem(postagem);
            } else if (tipo == TipoPostagem.IMAGEM) {
                fotogram.compartilharImagem(postagem);
            } else {
                fotogram.compartilharVideo(postagem);
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no Fotogram.");
        }

        // Compartilhar com AnyTube
        try {
            if (tipo == TipoPostagem.TEXTO) {
                anyTube.compartilharPostagem(postagem);
            } else if (tipo == TipoPostagem.IMAGEM) {
                anyTube.compartilharImagem(postagem);
            } else {
                anyTube.compartilharVideo(postagem);
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no AnyTube.");
        }
    }
}

