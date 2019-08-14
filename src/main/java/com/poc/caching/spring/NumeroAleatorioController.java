package com.poc.caching.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCaching
public class NumeroAleatorioController {

    @Autowired
    private NumeroAleatorioRepository numeroAleatorioRepository;

    @GetMapping("gerar/numero")
    public String gerarNumero(){
        return numeroAleatorioRepository.gerar();
    }
}
