package com.mycompany.ejpelicula;

import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
           return p2.getDuracionPelicula().compareTo(p1.getDuracionPelicula());
        }

    };
    
    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
           return p1.getDuracionPelicula().compareTo(p2.getDuracionPelicula());
        }

    };
    
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
           return p1.getNombre().compareTo(p2.getNombre());
        }

    };

    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
           return p1.getDirector().compareTo(p2.getDirector());
        }

    };
}

