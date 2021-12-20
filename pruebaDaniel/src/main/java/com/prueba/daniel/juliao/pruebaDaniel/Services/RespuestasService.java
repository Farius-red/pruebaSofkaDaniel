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

import java.util.ArrayList;
import java.util.List;

@Service
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


        return respuestas;
    }
}
