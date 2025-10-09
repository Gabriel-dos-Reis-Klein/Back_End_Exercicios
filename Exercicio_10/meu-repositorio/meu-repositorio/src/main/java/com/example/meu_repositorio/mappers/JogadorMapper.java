package com.example.meu_repositorio.mappers;

import com.example.meu_repositorio.dtos.JogadorResponseDTO;
import com.example.meu_repositorio.models.Jogador;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {
    public JogadorResponseDTO toDto (Jogador jogador){
        return new JogadorResponseDTO(
                jogador.getId(),
                jogador.getNome(),
                jogador.getSobrenome()
        );
    }
}
