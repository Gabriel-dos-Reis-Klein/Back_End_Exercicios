package com.example.meu_repositorio.dtos;

import org.springframework.stereotype.Component;


public record JogadorRequestDto(
        String nome,
        String sobrenome
) {
}
