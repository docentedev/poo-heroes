package com.docente.usuariosjson.service;

import com.docente.usuariosjson.dto.HeroeDto;

import java.util.ArrayList;

public interface IHeroesService {
    void crearHeroe(HeroeDto heroe);
    ArrayList<HeroeDto> obtenerHeroes();
}
