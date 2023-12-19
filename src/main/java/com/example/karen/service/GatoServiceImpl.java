package com.example.karen.service;

import com.example.karen.model.Gato;
import org.springframework.stereotype.Service;

@Service
public class GatoServiceImpl implements GatoService{
    public Gato getGato(){
        Gato amarillo = new Gato();
        amarillo.setId(1);
        amarillo.setNombre("Amarillo");
        amarillo.setEdad(2);

        return amarillo;
    }
    public Gato getGatoNuevo(){
        Gato blanco = new Gato();
        blanco.setId(2);
        blanco.setNombre("Blanco con manchas negras");
        blanco.setEdad(3);
        return blanco;
    }

}
