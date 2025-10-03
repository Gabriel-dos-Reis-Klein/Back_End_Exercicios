package com.example.meu_repositorio.services;

import com.example.meu_repositorio.models.Jogador;
import com.example.meu_repositorio.repositories.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class JogadorService {

    private JogadorRepository jogadorRepository;

    public JogadorService (JogadorRepository jogadorRepository){
        this.jogadorRepository=jogadorRepository;
    }

    public Jogador saveJogador(String nome, String sobrenome){
        Jogador novoJogador = new Jogador();
        novoJogador.setNome(nome);
        novoJogador.setSobrenome(sobrenome);
        novoJogador.setClube("Criciúma");
        jogadorRepository.save(novoJogador);
        return novoJogador;
    }

    public List<Jogador> getAllJogadores(){
        return jogadorRepository.findAll();
    }

    public Jogador umJogador(UUID id){
        return jogadorRepository.findById(id).get();
    }

    public Jogador deleteJogador(UUID id){
        Jogador jogador = jogadorRepository.findById(id).get();
        jogadorRepository.delete(jogador);
        return jogador;
    }

    public Jogador nomeJogador(String nome){
        return jogadorRepository.findByNome(nome).get();
    }
}
