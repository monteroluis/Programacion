/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import geometria.Punto;

/**
 *
 * @author Luis Montero
 */
public class Pruebapunto {
    
     
    public static void main(String[] args) {
       
        
      //declaracion e instanciación por constructor por parámetros        
        Punto punto1=new Punto(1,5);

        
        // Mostrando propiedades del punto1
        System.out.println("Punto 1");
        System.out.println(punto1.getCoordX());
        System.out.println(punto1.getCoordy());
        
        //declaracion e instanciación por contrucctor vacío
        Punto punto2=new Punto( );
        
        System.out.println("X:"+punto2.getCoordX());
        System.out.println("Y:"+punto2.getCoordy());
        
        
        //punto 3 por constructor copia
        Punto punto3=new Punto(punto1);
        
        System.out.println("X:"+punto3.getCoordX());
        System.out.println("Y:"+punto3.getCoordy());
        
        
        //modificación de coordenadas punto 2
        punto2.setCoordX(5);
        punto2.setCoordy(8);
        Punto punto4=new Punto(punto2);
       
        
        
        
        System.out.println("Comparativa puntos 2 y 4");
        System.out.println("X:"+punto2.getCoordX());
        System.out.println("Y:"+punto2.getCoordy());
        System.out.println("X:"+punto4.getCoordX());
        System.out.println("Y:"+punto4.getCoordy());
        
}
       
}

