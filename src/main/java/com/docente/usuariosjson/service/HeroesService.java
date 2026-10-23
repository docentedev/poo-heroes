package com.docente.usuariosjson.service;

import com.docente.usuariosjson.dto.HeroeDto;

import java.util.ArrayList;

public class HeroesService implements IHeroesService {
    private ArrayList<HeroeDto> heroes;

    public HeroesService() {
        this.heroes = new ArrayList<>();
    }
    @Override
    public void crearHeroe(HeroeDto heroe) {
        this.heroes.add(heroe);
    }

    @Override
    public ArrayList<HeroeDto> obtenerHeroes() {
        return this.heroes;
    }
}
