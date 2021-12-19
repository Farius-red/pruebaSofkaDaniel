package com.prueba.daniel.juliao.pruebaDaniel.Services;

import com.prueba.daniel.juliao.pruebaDaniel.Models.CategoriaModel;
import com.prueba.daniel.juliao.pruebaDaniel.Models.PreguntasModel;
import com.prueba.daniel.juliao.pruebaDaniel.Models.RespuestasModel;
import com.prueba.daniel.juliao.pruebaDaniel.interfases.Crud;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RespuestasService  implements Crud {


    @Override
    public List<PreguntasModel> listaPreguntas() {
        return null;
    }

    @Override
    public List<CategoriaModel> listaCategoria() {
        return null;
    }

    @Override
    public List<RespuestasModel> ListaRespuestas() {
        List<RespuestasModel> respuestas = new ArrayList<>();
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));
        respuestas.add(new RespuestasModel(1,"respuesta1"));


        return null;
    }
}
