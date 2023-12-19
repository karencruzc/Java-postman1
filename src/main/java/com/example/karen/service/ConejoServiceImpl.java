package com.example.karen.service;

import com.example.karen.model.Conejo;
import org.springframework.stereotype.Service;

@Service
public class ConejoServiceImpl implements ConejoService{
    public Conejo getConejo() {
        Conejo angora = new Conejo();
        angora.setId(1);
        angora.setNombre("Nueva Zelanda");
        angora.setEdad(1);
        return angora;
    }
}
