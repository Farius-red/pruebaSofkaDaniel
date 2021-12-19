package com.prueba.daniel.juliao.pruebaDaniel.Models;

public class JugadorModel {

    private int idJugador;
    private String nombre;
    private int score;

    public JugadorModel() {
    }

    public JugadorModel(int idJugador, String nombre, int score) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.score = score;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
