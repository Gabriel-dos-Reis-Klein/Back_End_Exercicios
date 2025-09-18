package org.estudantes.estudantes;


import org.estudantes.estudantes.estudante;
import org.estudantes.estudantes.estudanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class estudanteController {

    private final estudanteService estudanteService;

    public estudanteController(estudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    // POST - cadastrar estudante
    @PostMapping
    public estudante cadastrar(@RequestBody estudante estudante) {
        return estudanteService.salvarEstudante(estudante);
    }

    // GET - listar todos
    @GetMapping
    public List<estudante> listar() {
        return estudanteService.listarEstudantes();
    }

    // GET - buscar por código
    @GetMapping("/{codigo}")
    public estudante buscarPorCodigo(@PathVariable int codigo) {
        return estudanteService.buscarPorCodigo(codigo);
    }
}