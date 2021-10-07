/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import datos.Motocicleta;

/**
 *
 * @author Luis Montero
 */
public class Vector {

    private int max = 10; //modificar para ampliar tamaño de vector
    private int index = -1;
    private Motocicleta vector[] = new Motocicleta[max];

    //añadir elementos al vector
    public void add(Motocicleta nueva) {
        vector[++index] = nueva;

    }

    public int tamanio() {
        return index;
    }

    public boolean vacio() {
        return index == -1;
    }

    public boolean lleno() {
        return index == max;
    }

// busqueda secuencial en vector
    public int search(String placa) {

        if (!vacio()) {

            for (int i = 0; i <= index; i++) {
                if (vector[i].getPlaca().equalsIgnoreCase(placa)) {
                    return i;
                }
            }

        }
        return -1;

    }

//eliminacion de elementos
    public int remove(String placa) {
        int pos = search(placa);
        if (pos != -1) {
            for (int i = pos; i < index; i++) {
                vector[i] = vector[i + 1];
            }
            index--;
            return 0;
        }
        return -1;
    }

//obtener un elelemto del vector
    public Motocicleta get(int pos) {
        return vector[pos];
    }

}
