package org.recomendaViagem.Recomenda.Viagem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecomendaController {
    @GetMapping("/recomendar")
    public String recomendarDestino(@RequestParam String clima,
                                    @RequestParam String estilo) {

        if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("natureza")) {
            return "Recomendação: Fernando de Noronha - praias paradisíacas e natureza exuberante!";
        } else if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("cultura")) {
            return "Recomendação: Salvador - calor, música, festas e cultura rica!";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("natureza")) {
            return "Recomendação: Gramado - clima frio, montanhas e belas paisagens!";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("cultura")) {
            return "Recomendação: Curitiba - arquitetura, museus e clima ameno!";
        } else {
            return "Desculpe, não encontrei um destino para essa combinação.";
        }
    }
}
