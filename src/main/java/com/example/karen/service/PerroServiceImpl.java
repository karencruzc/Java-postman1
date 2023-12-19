package com.example.karen.service;

import com.example.karen.model.Perro;
import org.springframework.stereotype.Service;

@Service
public class PerroServiceImpl implements PerroService{


    public Perro getPerro(){

        Perro milka = new Perro();

        milka.setId(1);
        milka.setNombre("Milka");
        milka.setEdad(2);

        return milka;
    }

    public Perro getPerroNuevo(){

        Perro annie = new Perro();

        annie.setId(1);
        annie.setNombre("Annie");
        annie.setEdad(12);

        return annie;
    }
    public Perro getPerroNuevo2(){
        Perro lassie = new Perro();
        lassie.setId(2);
        lassie.setNombre("Lassie");
        lassie.setEdad(1);
        return lassie;
    }

    public Perro getPerroNuevo3(){
        Perro stacy = new Perro();
        stacy.setId(3);
        stacy.setNombre("Stacy");
        stacy.setEdad(1);
        return stacy;
    }


}
