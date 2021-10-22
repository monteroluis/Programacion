/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import clases.Persona;
import ed.Cola;
import ed.Lista;
import ed.Pila;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Montero
 */
public class Main <T>{
    
    public static void main(String[] args) {
        
     Pila pila=new Pila();
     Cola cola=new Cola();
      Main nuevo=new Main();
        Object tipo = JOptionPane.showInputDialog(null, "Que estructura desea utilizar", "Selcccione", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"PILA", "COLA"}, "");
        while (true) {
         switch (tipo.toString()) {

            case "PILA":
               
                switch (nuevo.pedirdatos().toString()) {
                    case "INSERTAR":
                        pila.insertar(JOptionPane.showInputDialog("Digite dato a ingresar"));
                        JOptionPane.showMessageDialog(null,"Ingrasado con exito");
                        break;
                    case "QUITAR":
                          JOptionPane.showMessageDialog(null,"se ha eliminado:"+pila.eliminar());
                        break;
                    case "IMPRIMIR":
                         JOptionPane.showMessageDialog(null,pila.imprimir());
                        break;
                    case "VACEAR":
                         pila.vacear();
                         JOptionPane.showMessageDialog(null,"Se ha vaceado la pila");
                        break;
                    case "VER TOPE":
                         JOptionPane.showMessageDialog(null,"El tope de la pila es"+pila.getTope());
                        break;
                   
                    default:
                        throw new AssertionError();
                }
             break;
             
             
            case "COLA":
                                  
                switch (nuevo.pedirdatos().toString()) {
                    case "INSERTAR":
                        cola.insertar(JOptionPane.showInputDialog("Digite dato a insertar"));
                        break;
                    case "QUITAR":
                         JOptionPane.showMessageDialog(null,"se ha eliminado"+cola.eliminar());
                        break;
                    case "IMPRIMIR":
                        JOptionPane.showMessageDialog(null,cola.imprimir());
                        break;
                    case "VACEAR":
                        cola.vacear();
                         JOptionPane.showMessageDialog(null,"Se ha vaceado la cola");
                        break;
                     case "VER TOPE":
                         break;
                    
                    default:
                        throw new AssertionError();
                }

                break;

            default:

                throw new AssertionError();
        }

    
        }
    }
            
               
    public Object pedirdatos(){
    
 
        return  JOptionPane.showInputDialog(null, "Que operación desea realizar", "tipo", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"INSERTAR", "QUITAR","IMPRIMIR","VER TOPE","VACEAR" }, "");
}

    
    
    
    
}//fin de clase
