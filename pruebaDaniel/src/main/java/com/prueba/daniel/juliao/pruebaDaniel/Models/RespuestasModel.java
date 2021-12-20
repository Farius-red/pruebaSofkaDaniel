package com.prueba.daniel.juliao.pruebaDaniel.Models;


public class RespuestasModel {

   private  Integer idRespuesta ;
   private  String respuesta;
   private int idPregunta;

   public RespuestasModel() {
   }

   public RespuestasModel(int idRespuesta, String respuesta, int idPregunta) {
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
