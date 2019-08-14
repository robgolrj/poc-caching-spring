package com.poc.caching.spring;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumeroAleatorioRepository {
    @Cacheable("numeroAleatorio")
    public String gerar(){
        Random gerador = new Random();
        return String.valueOf(gerador.nextInt());
    }
}
