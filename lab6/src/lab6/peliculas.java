/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class peliculas {
    private String ID;
    private String nombre;
    private String categoria;
    private ArrayList<String> idiomas=new ArrayList();
    private ArrayList<String> subtitulos=new ArrayList();
    private int duracion;
    private int rating;
    private ArrayList<String> comentarios=new ArrayList();
    private String productora;
    private String director;
    private ArrayList<String> actores=new ArrayList();

    public peliculas() {
    }

    public peliculas(String ID, String nombre, String categoria, int duracion, int rating, String productora, String director) {
        this.ID = ID;
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
        this.rating = rating;
        this.productora = productora;
        this.director = director;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
