package com.prueba.daniel.juliao.pruebaDaniel.entitys;

import javax.persistence.*;

@Entity
@Table(name = "respuestas")
public class RespuestasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idRespuesta ;

    private  String respuesta;
    private int idPregunta;

    public RespuestasEntity() {
    }

    public RespuestasEntity(int idRespuesta, String respuesta, int idPregunta) {
        this.idRespuesta = idRespuesta;
        this.respuesta = respuesta;
        this.idPregunta = idPregunta;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
}
