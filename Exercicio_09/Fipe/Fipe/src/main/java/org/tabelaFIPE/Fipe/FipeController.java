package org.tabelaFIPE.Fipe;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/api/marcas")
public class FipeController {

    private RestClient cliente = RestClient.create("https://parallelum.com.br/fipe/api/v1/carros");

    @GetMapping
    public Marca[] exibeTodasMarcas(){
        return cliente.get().uri("/marcas").retrieve().body(Marca[].class);
    }
    @GetMapping("/{modelo}/modelos")
    public Marca[] exibeTodosModelos(@RequestParam Modelo modelo){
        return cliente.get().uri("/marcas/"+modelo+"/modelos").retrieve().body(Marca[].class);
    }
}
