package com.example.meu_repositorio.controllers;

import com.example.meu_repositorio.dtos.JogadorRequestDto;
import com.example.meu_repositorio.dtos.JogadorResponseDTO;
import com.example.meu_repositorio.models.Jogador;
import com.example.meu_repositorio.services.JogadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    private JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService){
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public JogadorResponseDTO saveJogador(@RequestBody JogadorRequestDto jogadorRequestDto) {
        return jogadorService.saveJogador(jogadorRequestDto);
    }
    @GetMapping
    public List<JogadorResponseDTO> getAllJogadores() {
        return jogadorService.getAllJogadores();
    }
    @GetMapping("/{id}")
    public Jogador umJogador(@PathVariable UUID id){
        return jogadorService.umJogador(id);
    }

    @DeleteMapping("/{id}")
    public Jogador deleteJogador(@PathVariable UUID id){
        return jogadorService.deleteJogador(id);
    }

    @GetMapping("/nome")
    public Jogador nomeJogador(@RequestParam String nome){
        return jogadorService.nomeJogador(nome);
    }
}
