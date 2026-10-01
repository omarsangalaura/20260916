package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PruebaController{
    @Value("$NOMBRE_USR")
    private String nombre;

    @GetMapping("/saludo")
    public String unEndpoint(){
        return "Hola a todos y en especial a " + nombre;
    }

    @GetMapping("/despedida")
    public String otroEndpoint(){
        return "Hasta la siguiente semana!!";
    }
}