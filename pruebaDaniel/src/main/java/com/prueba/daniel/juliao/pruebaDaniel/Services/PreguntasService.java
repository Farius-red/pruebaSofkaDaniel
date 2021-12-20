package com.prueba.daniel.juliao.pruebaDaniel.Services;

import com.prueba.daniel.juliao.pruebaDaniel.Models.CategoriaModel;
import com.prueba.daniel.juliao.pruebaDaniel.Models.PreguntasModel;

import com.prueba.daniel.juliao.pruebaDaniel.Models.RespuestasModel;
import com.prueba.daniel.juliao.pruebaDaniel.interfases.Crud;
import com.prueba.daniel.juliao.pruebaDaniel.repository.RespuestasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PreguntasService implements Crud {

@Autowired
RespuestasRepository respuestasRepository;

    @Override
    public List<PreguntasModel> listaPreguntas() {
        List<PreguntasModel>  listaPreguntas = new ArrayList<>();


        //categoria 1
        listaPreguntas.add(new PreguntasModel(1,1,1,"quien"));
        listaPreguntas.add(new PreguntasModel(2,1,4,"porque"));
        listaPreguntas.add(new PreguntasModel(3,1,3,"cuando"));
        listaPreguntas.add(new PreguntasModel(4,1,5,"donde"));
        listaPreguntas.add(new PreguntasModel(5,1,7,"cual"));


        return  listaPreguntas;
    }

    @Override
    public List<CategoriaModel> listaCategoria() {

        List<CategoriaModel> catModel = new ArrayList<>();

        catModel.add(new CategoriaModel(1,"wh"));
        catModel.add(new CategoriaModel(2,"Preguntas comunes"));
        catModel.add(new CategoriaModel(3,"Preguntas sobre el estado de ánimo"));
        catModel.add(new CategoriaModel(4,"Preguntas para pedir, ofrecer e invitar"));
        catModel.add(new CategoriaModel(5,"Preferencias y actividades de ocio"));

        return catModel;
    }

    @Override
    public List<RespuestasModel> ListaRespuestas() {
      List<RespuestasModel>listaRespuestas = new ArrayList<>();
    listaRespuestas.add((RespuestasModel) respuestasRepository.findAll());

        return listaRespuestas;
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
