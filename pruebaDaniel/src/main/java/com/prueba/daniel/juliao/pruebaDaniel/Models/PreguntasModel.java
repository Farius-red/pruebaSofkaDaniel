package com.prueba.daniel.juliao.pruebaDaniel.Models;



public class PreguntasModel  {
     private int idPregunta ,idcategoria, idrespuesta;
     private String pregunta ,respuesta;
     
     

    public PreguntasModel() {
    }

    public PreguntasModel(int idPregunta, int idcategoria, int idrespuesta, String pregunta, String respuesta) {
        this.idPregunta = idPregunta;
        this.idcategoria = idcategoria;
        this.idrespuesta = idrespuesta;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
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

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
