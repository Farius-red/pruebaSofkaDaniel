package com.prueba.daniel.juliao.pruebaDaniel.entitys;

import javax.persistence.*;

@Entity
@Table(name = "score")
public class ScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int  idJuego;

    private  String nombre;
    private  double score;

    public ScoreEntity() {
    }

    public ScoreEntity(int idJuego, String nombre, double score) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.score = score;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
