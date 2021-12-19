package com.prueba.daniel.juliao.pruebaDaniel.Services;

import com.prueba.daniel.juliao.pruebaDaniel.Models.CategoriaModel;
import com.prueba.daniel.juliao.pruebaDaniel.Models.PreguntasModel;
import com.prueba.daniel.juliao.pruebaDaniel.interfases.Crud;

import java.util.ArrayList;
import java.util.List;

public class PreguntasService implements Crud {

    @Override
    public List<PreguntasModel> listaPreguntas() {
        List<PreguntasModel>  listaPreguntas = new ArrayList<>();

        //categoria 1
        listaPreguntas.add(new PreguntasModel(1,1,1,"pregunta1","respuesta1"));
        listaPreguntas.add(new PreguntasModel(2,1,2,"pregunta2","respuesta2"));
        listaPreguntas.add(new PreguntasModel(3,1,3,"pregunta3","respuesta3"));
        listaPreguntas.add(new PreguntasModel(4,1,4,"pregunta4","respuesta4"));
        listaPreguntas.add(new PreguntasModel(5,1,5,"pregunta5","respuesta5"));

        // categoria 2

        listaPreguntas.add(new PreguntasModel(6,2,6,"pregunta6","respuesta6"));
        listaPreguntas.add(new PreguntasModel(7,2,7,"pregunta7","respuesta7"));
        listaPreguntas.add(new PreguntasModel(8,2,8,"pregunta8","respuesta8"));
        listaPreguntas.add(new PreguntasModel(9,2,9,"pregunta9","respuesta9"));
        listaPreguntas.add(new PreguntasModel(10,2,10,"pregunta10","respuesta10"));


        // Categoria 3
        listaPreguntas.add(new PreguntasModel(11,3,11,"pregunta11","respuesta11"));
        listaPreguntas.add(new PreguntasModel(12,3,12,"pregunta12","respuesta12"));
        listaPreguntas.add(new PreguntasModel(13,3,13,"pregunta13","respuesta13"));
        listaPreguntas.add(new PreguntasModel(14,3,14,"pregunta14","respuesta14"));
        listaPreguntas.add(new PreguntasModel(15,3,15,"pregunta15","respuesta15"));

        // Categoria 4
        listaPreguntas.add(new PreguntasModel(16,4,16,"pregunta16","respuesta16"));
        listaPreguntas.add(new PreguntasModel(17,4,17,"pregunta17","respuesta17"));
        listaPreguntas.add(new PreguntasModel(18,4,18,"pregunta18","respuesta18"));
        listaPreguntas.add(new PreguntasModel(19,4,19,"pregunta19","respuesta19"));
        listaPreguntas.add(new PreguntasModel(20,4,20,"pregunta20","respuesta20"));


        // categoria 5
        listaPreguntas.add(new PreguntasModel(21,5,21,"pregunta21","respuesta21"));
        listaPreguntas.add(new PreguntasModel(22,5,22,"pregunta22","respuesta22"));
        listaPreguntas.add(new PreguntasModel(33,5,23,"pregunta23","respuesta23"));
        listaPreguntas.add(new PreguntasModel(24,5,24,"pregunta24","respuesta24"));
        listaPreguntas.add(new PreguntasModel(25,5,25,"pregunta25","respuesta25"));

        return listaPreguntas;
    }

    @Override
    public List<CategoriaModel> listaCategoria() {

        List<CategoriaModel> catModel = new ArrayList<>();

        catModel.add(new CategoriaModel(1,"categoria1"));
        catModel.add(new CategoriaModel(2,"categoria2"));
        catModel.add(new CategoriaModel(3,"categoria3"));
        catModel.add(new CategoriaModel(4,"categoria4"));
        catModel.add(new CategoriaModel(5,"categoria5"));

        return catModel;
    }
}
