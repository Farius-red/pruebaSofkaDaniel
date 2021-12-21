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
   public  int idCategoria ;
   public List<RespuestasModel>listaRespuestas = new ArrayList<>();
   public  List<PreguntasModel>  listaPreguntas;
   public List<PreguntasModel> preguntas = new ArrayList<>();
   public  List<CategoriaModel> catModel = new ArrayList<>();

   public boolean  rta ;
   public int respuestas;
   public  boolean inicioJuego =false, finalJuego =false;


    @Override
    public List<PreguntasModel> listaPreguntas() {

        //categoria 1
        listaPreguntas.add(new PreguntasModel(1,1,1,"quien"));
        listaPreguntas.add(new PreguntasModel(2,1,4,"porque"));
        listaPreguntas.add(new PreguntasModel(3,1,3,"cuando"));
        listaPreguntas.add(new PreguntasModel(4,1,5,"donde"));
        listaPreguntas.add(new PreguntasModel(5,1,7,"cual"));

         // categoria2
        listaPreguntas.add(new PreguntasModel(6,2,100,"¿Cómo te llamas?"));
        listaPreguntas.add(new PreguntasModel(7,2,18,"¿Cómo se llama tu jefe?"));
        listaPreguntas.add(new PreguntasModel(8,2,14,"¿Cuántos años tienes?"));
        listaPreguntas.add(new PreguntasModel(9,2,21,"¿Estás casado?"));
        listaPreguntas.add(new PreguntasModel(10,2,24,"¿Qué estás haciendo?"));

        //categoria 3

        listaPreguntas.add(new PreguntasModel(11,3,34,"¿Cómo te sientes?"));
        listaPreguntas.add(new PreguntasModel(12,3,36,"¿Estás bien?"));
        listaPreguntas.add(new PreguntasModel(13,3,38,"¿Te sientes mejor?"));
        listaPreguntas.add(new PreguntasModel(14,3,39,"¿Necesitas ir al médico?"));
        listaPreguntas.add(new PreguntasModel(15,3,35,"¿Qué pasa?"));

        //categoria 4

        listaPreguntas.add(new PreguntasModel(16,4,41,"¿Te gustaría tomar un café?"));
        listaPreguntas.add(new PreguntasModel(17,4,42,"¿Podría tomar un poco más de vino?"));
        listaPreguntas.add(new PreguntasModel(18,4,43,"¿Te importaría hacerme un sandwich?"));
        listaPreguntas.add(new PreguntasModel(19,4,44,"¿Te importa si abro la ventana?"));
        listaPreguntas.add(new PreguntasModel(20,4,45,"¿Podrías ayudarme a traducir eso al inglés?"));

        //categoria 5

        listaPreguntas.add(new PreguntasModel(21,5,48,"¿Te gusta el vino blanco?"));
        listaPreguntas.add(new PreguntasModel(22,5,49,"¿Cuál es tu grupo de música favorito?"));
        listaPreguntas.add(new PreguntasModel(23,5,53,"¿Prefieres ir a la playa, o a la montaña?"));
        listaPreguntas.add(new PreguntasModel(24,5,54,"¿Qué te gusta hacer en tu tiempo libre?"));
        listaPreguntas.add(new PreguntasModel(25,5,56,"¿Podrías repetirlo?"));

        return  listaPreguntas;
    }

    @Override
    public List<CategoriaModel> listaCategoria() {

        catModel.add(new CategoriaModel(1,"wh"));
        catModel.add(new CategoriaModel(2,"Preguntas comunes"));
        catModel.add(new CategoriaModel(3,"Preguntas sobre el estado de ánimo"));
        catModel.add(new CategoriaModel(4,"Preguntas para pedir, ofrecer e invitar"));
        catModel.add(new CategoriaModel(5,"Preferencias y actividades de ocio"));

        return catModel;
    }

    @Override
    public List<RespuestasModel> ListaRespuestas() {
        return null;
    }

    //filtra respuestas segun idPregunta
    public List<RespuestasModel> findByIdPregunta(int idPregunta){
        listaRespuestas.add(respuestasRepository.findByIdPregunta(idPregunta));
        return  listaRespuestas;
    }

    public boolean filtarRespuestas(){

        try {
            for (int i = 0; i < preguntas.size() ; i++) {
                int idPregunta =  preguntas.get(i).getIdPregunta();
                findByIdPregunta(idPregunta);
                if(respuestas != 0) continue; else break;

            }

            if(preguntas.size() > 0) rta = true; else rta = false;

        }catch (Exception e){
            rta = false;
            System.out.println ("El error funcion filtrar Respuestas clase PreguntasService: " + e.getMessage());
            e.printStackTrace();
        }
        return  rta;
    }



    public List<PreguntasModel> preguntasByIdCategoria(int idCategoria){

        for (PreguntasModel pregunta: listaPreguntas
             ) {
                if (pregunta.getIdcategoria() == idCategoria){
                     preguntas.add(pregunta);
                }
        }
        return  preguntas;
    }

    public  List<RespuestasModel> vaciarListaRespuetas(){
        if (!preguntas.isEmpty()){
            listaRespuestas.clear();
        }
        return listaRespuestas;
    }
    public  boolean verificarRespuestas(){
        if (!preguntas.isEmpty()) {
            if (respuestas > 0)
            try {
                for (int i = 0; i < preguntas.size(); i++) {
                    if (respuestas == preguntas.get(i).getIdrespuesta()){
                        preguntas.remove(i);
                    }else {
                        finalJuego();
                    }

                }

                if (preguntas.isEmpty())
                    vaciarListaRespuetas();

               rta = true;
            } catch (Exception e) {
                rta = false;
                System.out.println("error funcion verifiCarRespuestas clasee PreguntasService: " + e.getMessage());
                e.printStackTrace();
            }

        }else{
            aumentarDeNivel();
            rta =true;
        }
        return rta;

    }

    public  boolean aumentarDeNivel(){
        if(!catModel.isEmpty())
        try {
if(idCategoria > catModel.size()) {
    idCategoria = 0;
    for (int i = 0; i < catModel.size(); i++) {
        int elementoEncontrado = catModel.get(i).getIdCategoria();
        if (elementoEncontrado == idCategoria) {
            catModel.remove(i);
            if (catModel.isEmpty()) break;
            else idCategoria = elementoEncontrado + 1;
            break;
        }
    }

    rta = true;
}
        }catch (Exception e){
            rta = false;
            System.out.println ("error funcion Aumentar Nivel: " + e.getMessage());
            e.printStackTrace();
        }

         return rta;
    }
    public boolean inicioJuego(){
          inicioJuego= true;
        return inicioJuego;
    }

 public  boolean configuracionJuego(){
        if(inicioJuego == false && finalJuego == false) {
            inicioJuego();
            listaCategoria();
            listaPreguntas();
        }
     try {

         if (listaPreguntas.isEmpty()) {
             idCategoria = (int) (Math.random() * 5 + 1);
             preguntasByIdCategoria(idCategoria);
             filtarRespuestas();
             verificarRespuestas();

         }else {
                if (!catModel.isEmpty())
                    verificarRespuestas();


         }
       rta=true;
     }catch (Exception e){
         rta = false;
         System.out.println ("error funcion configuracionJuego clasee PreguntasService: " + e.getMessage());
         e.printStackTrace();
     }




     return  rta;
 }

 public boolean finalJuego(){
        finalJuego= true;
        return  finalJuego;
 }

}
