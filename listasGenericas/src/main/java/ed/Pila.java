/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author Luis Montero
 * @param <T>
 */
public class Pila <T> extends Lista<T>{
      
    private Lista pila;
    private Nodo raiz;
    
    public Pila() {
      
       pila=new Lista();
       raiz=pila.getRaiz();
    }
  
    public void insertar(T dato){
        
    pila.insertarInicio(dato);
       
    }
    
    public boolean busqueda(T dato){
        return pila.buscar(dato);
    }
    
    public T eliminar(){
     return (T)pila.eliminarPrincipio();
    }
    
    public String  imprimir(){
   
        String contenido="";
        for (int i = 0; i < pila.getTamanio(); i++) {
            contenido+=pila.obtener(i)+"→";
        }
    
       return contenido+"Null";
    }

    @Override
    public boolean vacia(){
        return pila.vacia();
    }
    
    @Override
    public T getTope(){
        if(!vacia()){
        return(T) pila.obtener(0);
        }
        
        return null;
    }
    
   public void vacear(){
       pila.borrarLista();
   }
    
    @Override
   public T getFin(){
       return (T) pila.getFin();
   }
    
    
   
    
    
    

//////////CONSTRUCTOR
////////INSERTAR
/////////QUITAR
/////////VACIA
////CIMA (INICIO Y FIN)
//IMPRIMIR Y TOSTRING
//VACIAR

    @Override
    public String toString() {
        return "Pila{" + "pila=" + pila + '}';
    }
    
    
    
}
