package com.prueba.daniel.juliao.pruebaDaniel.Models;

public class RespuestasModel {

   private  int idRespuesta ;
   private  String respuesta;


   public RespuestasModel() {
   }

   public RespuestasModel(int idRespuesta, String respuesta) {
      this.idRespuesta = idRespuesta;
      this.respuesta = respuesta;
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
}
