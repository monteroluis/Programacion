/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import datos.Motocicleta;
import ed.Vector;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Montero
 */
public class Concesionario {

    private Vector vector = new Vector();

    //valida el ingreso de los datos 
    public Motocicleta pedirdatos() {

        try {

            String placa = JOptionPane.showInputDialog("Digite placa");
            if (vector.search(placa) == -1) {
                String color = JOptionPane.showInputDialog("color");
                String modelo = JOptionPane.showInputDialog("Modelo");
                int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Cilindraje"));
                Object tipo = JOptionPane.showInputDialog(null, "Seleccione un tipo", "tipo", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SCOOTER", "ENDURO", "SPORT", "SUPER SPORT"}, "");
                Object transmision = JOptionPane.showInputDialog(null, "Seleccione una transmision", "Transmision", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"MANUAL", "AUTOMÁTICA", "SEMIAUTOMATICA"}, "");

                Motocicleta nueva = new Motocicleta(placa, color, modelo, cilindraje, transmision.toString(), tipo.toString());
                return nueva;
            } else {

                JOptionPane.showMessageDialog(null, "Esta placa ya se encuentra registrada");

            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos inválidos");
        }

        return null;
    }

//validacion de busqueda
    public void buscar(Vector vec) {
        if (!vector.vacio()) {
            String placa = JOptionPane.showInputDialog("Digite placa");
            int pos = vec.search(placa);
            if (pos != -1) {
                JOptionPane.showMessageDialog(null, "Dato en la posicion :"+ (pos+1));
            } else {

                JOptionPane.showMessageDialog(null, "Dato No encontrado");
            }
        } else {

            JOptionPane.showMessageDialog(null, "No hay datos registrados");
        }
    }

//modificar valores de aributos del vector
    public void Editar(Vector vec) {

        if (!vec.vacio()) {

            String placa = JOptionPane.showInputDialog("Digite placa a editar");
            int pos = vec.search(placa);
            if (pos != -1) {
                Motocicleta nueva = pedirdatos();
                vec.get(pos).setPlaca(nueva.getPlaca());
                vec.get(pos).setTipo(nueva.getTipo());
                vec.get(pos).setColor(nueva.getColor());
                vec.get(pos).setNombremode(nueva.getNombremode());
                vec.get(pos).setTransmision(nueva.getTransmision());
                vec.get(pos).setCilindraje(nueva.getCilindraje());
            } else {
                JOptionPane.showMessageDialog(null, "  Placa no encontrada");

            }

        } else {

            JOptionPane.showMessageDialog(null, "No hay datos guardados");
        }

    }
    
    //listar elementos añadidos
    public void mostrar(Vector vector) {
        if (!vector.vacio()) {
            String muestra = " ";
            for (int i = 0; i <= vector.tamanio(); i++) {
                muestra += "\n" + vector.get(i).toString();
            }
            JOptionPane.showMessageDialog(null, muestra);
        } else {
            JOptionPane.showMessageDialog(null, "no hay datos que mostrar");

        }

    }

    public void eliminar(Vector vector) {
        if (!vector.vacio()) {
            String placa = JOptionPane.showInputDialog("placa");
            if (vector.remove(placa) != -1) {
                JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
            } else {

                JOptionPane.showMessageDialog(null, "Placa No Encontrada");
            }
        } else {

            JOptionPane.showMessageDialog(null, "No hay datos Registrados");
        }
    }

    public void agregar(Vector vector) {
        if (!vector.lleno()) {
            Motocicleta nueva = pedirdatos();
            if (nueva != null) {

                vector.add(nueva);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El vector se ha llenado");
        }
    }

    //opciones y validaciones del menu
    public int menu(Object opcion) {

        int value = 0;

        switch (opcion.toString()) {

            case "AGREGAR":
                //agregar
                agregar(vector);
                break;

            case "BUSCAR":
                //buscar
                buscar(vector);
                break;
            case "EDITAR":
                //editar
                Editar(vector);
                break;

            case "ELIMINAR":
                //eliminar
                eliminar(vector);
                break;
            case "MOSTRAR":
                //mostrar
                mostrar(vector);

                break;
            case "SALIR":
                //SALIR
                value = -1;
                break;
            default:
                JOptionPane.showMessageDialog(null, "la opcion digitada No  es válida");
        }

        return value;
    }

    public static void main(String[] args) {

        Concesionario auteco = new Concesionario();
        int repeat = 0;
        while (repeat != -1) {
            Object opcion = JOptionPane.showInputDialog(null, "Seleccione un opción",
                    "Menú", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"AGREGAR", "BUSCAR", "EDITAR", "ELIMINAR", "MOSTRAR", "SALIR"}, "seleccione");
            repeat = auteco.menu(opcion);
        }
    }

}
