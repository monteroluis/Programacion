/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author Luis Montero
 */
public class Punto {
     
    //ATRIBUTOS
    private int coordX;
    private int coordy;

    
    //CONSTRUCTORES
    
    //constructor vacío
    public Punto() {

    }
    
    //constructor por parámetros
    public Punto(int coordX, int coordy) {
        this.coordX = coordX;
        this.coordy = coordy;
    }
 
     // constructor copia
    public Punto(Punto punto) {
        this.coordX = punto.getCoordX();
        this.coordy = punto.getCoordy();
    }
    
    //MÉTODOS

    public void Desplazar(int x, int y) {

        this.coordX += x;
        this.coordy += y;
    }
    
    
    // getters y setters
    /**
     * @return the coordX
     */
    public int getCoordX() {
        return coordX;
    }

    /**
     * @param coordX the coordX to set
     */
    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    /**
     * @return the coordy
     */
    public int getCoordy() {
        return coordy;
    }

    /**
     * @param coordy the coordy to set
     */
    public void setCoordy(int coordy) {
        this.coordy = coordy;
    }
    
    
    


}
