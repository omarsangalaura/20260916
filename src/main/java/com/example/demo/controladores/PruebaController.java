package com.example.demo.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PruebaControlles{
    @GetMapping("/saludo")
    public String unEndpoint(){
        return "Hola a todos";
    }

    @GetMapping("/despedida")
    public String otroEndpoint(){
        return "Hasta la siguiente semana!!";
    }
}