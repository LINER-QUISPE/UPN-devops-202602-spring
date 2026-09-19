package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Ruta base opcional para el controlador
public class SaludoController {

    // Endpoint GET que responde a: http://localhost:8080/api/saludo
    @GetMapping("/saludo")
    public String enviarSaludo() {
        return "¡Hola! Bienvenido al proyecto desarrollado con Spring Boot. Atte: Liner Quispe";
    }

    // (Opcional) Endpoint GET con un parámetro de nombre: http://localhost:8080/api/saludo?nombre=Liner
    @GetMapping("/saludo-personalizado")
    public String enviarSaludoPersonalizado(@RequestParam(value = "nombre", defaultValue = "Invitado") String nombre) {
        return "¡Hola, " + nombre + "! Saludos desde el backend con Spring Boot.";
    }
}