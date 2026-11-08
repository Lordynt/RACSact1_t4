package com.racsact1_t4.springboot_applications.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EjemploController {
    @GetMapping("/identidad")
    public String identidad() {
        return "Iniciales: RACS | Nombre: Roque Antonio Cruz Santiago";
    }
    @GetMapping("/datos-personales")
    public Map<String, Object> datosPersonales() {
        return Map.of(
            "edad", 21,
            "sexo", "masculino",
            "altura", "1.71 metros",
            "nacimiento", "16/08/2005"
        );
    }
    @GetMapping("/texto")
    public String textoSimple() {
        return "Este es el endpoint C";
    }
}