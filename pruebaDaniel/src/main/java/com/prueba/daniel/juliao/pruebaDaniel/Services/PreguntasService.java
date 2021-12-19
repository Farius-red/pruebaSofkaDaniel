package com.prueba.daniel.juliao.pruebaDaniel.Services;

import com.prueba.daniel.juliao.pruebaDaniel.Models.CategoriaModel;
import com.prueba.daniel.juliao.pruebaDaniel.Models.PreguntasModel;

import com.prueba.daniel.juliao.pruebaDaniel.Models.RespuestasModel;
import com.prueba.daniel.juliao.pruebaDaniel.interfases.Crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PreguntasService implements Crud {

    @Override
    public List<PreguntasModel> listaPreguntas() {
        List<PreguntasModel>  listaPreguntas = new ArrayList<>();
        return  listaPreguntas;
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

    @Override
    public List<RespuestasModel> ListaRespuestas() {




        return null;
    }

    public  List<PreguntasModel> ConfigurarJuego(){
        List<PreguntasModel>preguntas = new ArrayList<>();
        int rondaNumero = (int)(Math.random()*5+1);


        List<PreguntasModel> todasLaspreguntas = listaPreguntas();
        for (PreguntasModel pregunta: todasLaspreguntas
             ) {
                if (pregunta.getIdcategoria() == rondaNumero){
                     preguntas.add(pregunta);
                }
                    
        }

        return  preguntas;
    }


    public int ResponderAlapregunta(){
        int respuesta =1;
         return respuesta;
    }




}
