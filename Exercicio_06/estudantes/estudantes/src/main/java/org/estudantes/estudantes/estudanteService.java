package org.estudantes.estudantes;

import org.estudantes.estudantes.estudante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class estudanteService {
    private final List<estudante> estudantes = new ArrayList<>();

    public estudante salvarEstudante(estudante estudante) {
        estudantes.add(estudante);
        return estudante;
    }

    public List<estudante> listarEstudantes() {
        return estudantes;
    }

    public estudante buscarPorCodigo(int codigo) {
        return estudantes.stream()
                .filter(e -> e.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }
}