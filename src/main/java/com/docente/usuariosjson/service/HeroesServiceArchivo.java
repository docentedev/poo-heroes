package com.docente.usuariosjson.service;

import com.docente.usuariosjson.dao.HeroesDao;
import com.docente.usuariosjson.dto.HeroeDto;

import java.util.ArrayList;

public class HeroesServiceArchivo implements IHeroesService {

    private HeroesDao heroesDao;

    public HeroesServiceArchivo() {
        this.heroesDao = new HeroesDao();
    }

    @Override
    public void crearHeroe(HeroeDto heroe) {
        ArrayList<HeroeDto> listado = this.heroesDao.obtenerHeroes();
        listado.add(heroe);
        this.heroesDao.guardarHeroes(listado);
    }

    @Override
    public ArrayList<HeroeDto> obtenerHeroes() {
        return this.heroesDao.obtenerHeroes();
    }
}
