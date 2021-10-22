/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author Luis Montero
 */
public class Cola <T> extends Lista<T> {
    
   
    private Lista cola;

    public Cola() {
        cola=new Lista();
    }
    
   
   
    public void insertar(T dato){
        
     cola.insertarFinal(dato);
      
    } 
    
     public T obtener(){
        return (T)cola.obtener(0);
    }

    public String  imprimir(){
        String contenido="";
        for (int i = 0; i < cola.getTamanio(); i++) {
            contenido+=cola.obtener(i)+"→";
        }
    
       return contenido+"Null";
       
    }

    public boolean colavacia() {
        return cola.vacia();
    }
    
     public T eliminar(){
     return (T)cola.eliminarPrincipio();
    }
     
     public void vacear(){
         cola.borrarLista();
     }

    @Override
    public T getTope(){
       return (T) cola.getTope();
    }
   
   
}