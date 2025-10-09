package com.example.meu_repositorio.dtos;

import java.util.UUID;

public record JogadorResponseDTO(
        UUID id,
        String nome,
        String sobrenome
) {

}
