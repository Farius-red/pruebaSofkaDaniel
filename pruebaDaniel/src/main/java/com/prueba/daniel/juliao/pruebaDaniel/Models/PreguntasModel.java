package com.prueba.daniel.juliao.pruebaDaniel.Models;

import java.util.List;

public class PreguntasModel  {
     private int idPregunta ,idcategoria, idrespuesta;
     private String pregunta ;


    public PreguntasModel() {
    }

    public PreguntasModel(int idPregunta, int idcategoria, int idrespuesta, String pregunta) {
        this.idPregunta = idPregunta;
        this.idcategoria = idcategoria;
        this.idrespuesta = idrespuesta;
        this.pregunta = pregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public int getIdrespuesta() {
        return idrespuesta;
    }

    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
