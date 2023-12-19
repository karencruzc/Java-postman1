package com.example.karen.controller;


import com.example.karen.model.Conejo;
import com.example.karen.model.Gato;
import com.example.karen.model.Perro;
import com.example.karen.service.ConejoService;
import com.example.karen.service.GatoService;
import com.example.karen.service.PerroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("perros")
@RestController
public class KarenController {

    @Autowired
    private PerroService perroService;

    @GetMapping("/get-perro")
    public Perro HelloWorld(){
        return perroService.getPerro();
    }

    @GetMapping("/perro-nuevo")
    public Perro cambiaNombrePerro(){
        return perroService.getPerroNuevo();
    }
    @GetMapping("perro-nuevo2")
    public Perro cambiaNombrePerro2(){
        return perroService.getPerroNuevo2();
    }

    @GetMapping("perro-nuevo3")
    public Perro cambiaNombrePerro3(){
        return perroService.getPerroNuevo3();
    }
    @Autowired
    private GatoService gatoService;
    @GetMapping("gato-nuevo")
    public Gato cambiarNombreGato1(){
        return gatoService.getGato();
    }
    @GetMapping("gato-nuevo1")
    public Gato cambiarNombreGato2(){
        return gatoService.getGatoNuevo();
    }
    @Autowired
    private ConejoService conejoService;

    @GetMapping("/get-conejo")
    public Conejo nombreConejo(){
        return conejoService.getConejo();
    }



}
