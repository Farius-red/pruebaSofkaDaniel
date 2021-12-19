package com.prueba.daniel.juliao.pruebaDaniel.interfases;

import com.prueba.daniel.juliao.pruebaDaniel.Models.CategoriaModel;
import com.prueba.daniel.juliao.pruebaDaniel.Models.PreguntasModel;

import java.util.List;

public interface Crud {
    public  List<PreguntasModel> listaPreguntas();
    public  List<CategoriaModel> listaCategoria();


}