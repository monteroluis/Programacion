/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Luis Montero
 */
public class Motocicleta {

    private String placa;
    private String color;
    private String nombremodelo;
    private int cilindraje;
    private String tipo;
    private String transmision;

    //constructor por placa
    public Motocicleta(String placa) {
        this.placa = placa;
    }

// constructor por parámetros
    public Motocicleta(String placa, String color, String nombremodelo, int cilindraje, String transmision, String tipo) {
        this.placa = placa;
        this.color = color;
        this.nombremodelo = nombremodelo;
        this.cilindraje = cilindraje;
        this.transmision = transmision;
        this.tipo = tipo;
    }

    //constructor copia
    public Motocicleta(Motocicleta nueva) {
        this.placa = nueva.placa;
        this.color = nueva.color;
        this.nombremodelo = nueva.nombremodelo;
        this.cilindraje = nueva.cilindraje;
        this.transmision = nueva.transmision;
        this.tipo = nueva.tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombremode() {
        return nombremodelo;
    }

    public void setNombremode(String nombremodelo) {
        this.nombremodelo = nombremodelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motocicleta " + "placa:" + placa + ", color:" + color + ", nombre del modelo:" + nombremodelo + ", cilindraje:" + cilindraje + ", transmision:" + transmision + ", tipo:" + tipo;
    }

}
