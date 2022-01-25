package com.mycompany.ejpelicula;

public class Pelicula {
    private String nombre;
    private String director;
    private Integer duracionPelicula;

    public Pelicula(){
        
    }
    
    public Pelicula(String nombre, String director, Integer duracionPelicula) {
        this.nombre = nombre;
        this.director = director;
        this.duracionPelicula = duracionPelicula;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(Integer duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", director=" + director + ", duracionPelicula=" + duracionPelicula + '}';
    }
    
    
    
    
}
