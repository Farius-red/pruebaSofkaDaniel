package com.prueba.daniel.juliao.pruebaDaniel.Models;

public class CategoriaModel {
    private int idCategoria;
    private String nombreCategoria;

    public CategoriaModel() {

    }

    public CategoriaModel(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
