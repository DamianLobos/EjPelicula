package com.mycompany.ejpelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opcion;
        ServicePelicula serv = new ServicePelicula();
        ArrayList<Pelicula> listadoPelis = new ArrayList();
        do{
            listadoPelis.add(serv.cargarPelicula());
            System.out.println("Desea agregar otra pelicula? Si o No");
            opcion = scan.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        serv.mostrarPeliculas(listadoPelis);
        serv.peliculasLargas(listadoPelis);
        serv.ordenarDescendente(listadoPelis);
        serv.mostrarPeliculas(listadoPelis);
        serv.ordenarAscendente(listadoPelis);
        serv.mostrarPeliculas(listadoPelis);
        serv.ordenPorNombre(listadoPelis);
        serv.mostrarPeliculas(listadoPelis);
        serv.ordenarPorDirector(listadoPelis);
        serv.mostrarPeliculas(listadoPelis);
        
    }
}
