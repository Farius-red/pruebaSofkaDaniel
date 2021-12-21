package com.prueba.daniel.juliao.pruebaDaniel.repository;



import com.prueba.daniel.juliao.pruebaDaniel.Models.RespuestasModel;
import com.prueba.daniel.juliao.pruebaDaniel.entitys.RespuestasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestasRepository extends JpaRepository<RespuestasEntity, Integer> {

   RespuestasModel findByIdPregunta(int idPregunta);
}
