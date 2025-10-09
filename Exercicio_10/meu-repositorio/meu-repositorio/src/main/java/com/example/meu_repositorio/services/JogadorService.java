package com.example.meu_repositorio.services;

import com.example.meu_repositorio.dtos.JogadorRequestDto;
import com.example.meu_repositorio.dtos.JogadorResponseDTO;
import com.example.meu_repositorio.mappers.JogadorMapper;
import com.example.meu_repositorio.models.Jogador;
import com.example.meu_repositorio.repositories.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class JogadorService {

    private JogadorRepository jogadorRepository;
    private JogadorMapper jogadorMapper;

    public JogadorService (
            JogadorRepository jogadorRepository,
            JogadorMapper jogadorMapper
        ){
        this.jogadorRepository=jogadorRepository;
        this.jogadorMapper = jogadorMapper;
    }

    public JogadorResponseDTO saveJogador(JogadorRequestDto jogadorRequestDto){
        Jogador novoJogador = new Jogador();
        novoJogador.setNome(jogadorRequestDto.nome());
        novoJogador.setSobrenome(jogadorRequestDto.sobrenome());
        novoJogador.setClube("Criciúma");
        jogadorRepository.save(novoJogador);
        return jogadorMapper.toDto(novoJogador);
    }

    public List<JogadorResponseDTO> getAllJogadores()
    {
        return jogadorRepository.findAll().stream().map(jogadorMapper::toDto).toList();

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
