package com.mycompany.ejpelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicePelicula {
    
    Scanner scan = new Scanner(System.in);
    
    public Pelicula cargarPelicula() throws NumberFormatException{
        System.out.println("Ingrese titulo de la pelicula: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese director de la pelicula: ");
        String director = scan.nextLine();
        System.out.println("Ingrese duracion en horas de la pelicula: ");
        Integer horas = Integer.parseInt(scan.nextLine());
        return new Pelicula(nombre, director, horas);
    }
    
    public void ordenarDescendente(ArrayList<Pelicula> listadoPelis){
        Collections.sort(listadoPelis, Comparadores.compararDuracionDescendente);
    }
    
    public void ordenarPorDirector(ArrayList<Pelicula> listadoPelis){
        Collections.sort(listadoPelis, Comparadores.compararDirector);
    }
    
    public void ordenPorNombre(ArrayList<Pelicula> listadoPelis){
        Collections.sort(listadoPelis, Comparadores.compararTitulo);
    }
    
    public void ordenarAscendente(ArrayList<Pelicula> listadoPelis){
        Collections.sort(listadoPelis, Comparadores.compararDuracionAscendente);
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> listadoPeliculas){
        for(Pelicula peli: listadoPeliculas){
            System.out.println(peli);
        }
    }
    
    public void peliculasLargas(ArrayList<Pelicula> listadoPeliculas){
        Iterator it = listadoPeliculas.iterator();
        while(it.hasNext()){
            Pelicula peli = (Pelicula)it.next();
            if(peli.getDuracionPelicula()>1){
                System.out.println(peli);
            }
        }
    }
}
