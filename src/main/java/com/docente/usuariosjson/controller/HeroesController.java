package com.docente.usuariosjson.controller;

import com.docente.usuariosjson.dto.HeroeDto;
import com.docente.usuariosjson.service.HeroesService;
import com.docente.usuariosjson.service.HeroesServiceArchivo;
import com.docente.usuariosjson.service.IHeroesService;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HeroesController {
    @FXML
    public TextField txtId;
    @FXML
    public TextField txtNombre;
    @FXML
    public TableView<HeroeDto> tableHeroes;
    @FXML
    public TableColumn<HeroeDto, Integer> colId;
    @FXML
    public TableColumn<HeroeDto, String> colNombre;

    private IHeroesService heroesService;

    public HeroesController() {
        this.heroesService = new HeroesServiceArchivo();
    }

    @FXML
    public void handleCrear(MouseEvent mouseEvent) {
        Integer id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        HeroeDto heroeDto = new HeroeDto(id, nombre);
        this.heroesService.crearHeroe(heroeDto);
    }

    @FXML
    public void handleSeleccionado(MouseEvent mouseEvent) {
        System.out.println(this.heroesService.obtenerHeroes().size());
        for (HeroeDto heroe : this.heroesService.obtenerHeroes()) {
            System.out.println(heroe);
        }
    }
}
