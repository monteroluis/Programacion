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
public class Lista <T> {

    private Nodo raiz;
    private int tamanio;
    private Nodo fin;
  
    public Lista() {
        this.raiz = null;
        this.tamanio = 0;
        this.fin=null;
    }
    
  
    public void insertarInicio(T dato) {
        Nodo nodo = new Nodo(dato);
        if (vacia()) {
            fin=raiz = nodo;
            tamanio++;
        } else{
            nodo.setSiguiente(raiz);
            raiz = nodo;
            tamanio++;
        }
       
    }

    public void insertarFinal(T dato) {
        if (vacia()) {
            insertarInicio(dato);
        } else {
            Nodo nodo = new Nodo(dato);
            fin.setSiguiente(nodo);
            fin=fin.getSiguiente();
            tamanio++;
        }

    }

    public T obtener(int pos) {
       
        if (vacia()) {
            return null;
        } else {
            Nodo aux = raiz;
            int contador = 0;
            while (contador < pos && aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
                contador++;
            }
            if (contador != pos) {
                return null;
            } else {
                
                
                return (T) aux.getDato();
            }
        }
    }

// Indica si esta la lista vacia o no  
    public boolean vacia() {
        return raiz == null;
    }

    public T eliminarPrincipio() {
        if (!vacia()) {
            Nodo aux = raiz;
            raiz=raiz.getSiguiente();
            aux.setSiguiente(null);
            tamanio--;
            
            if (raiz == null) {
          
                fin = null;

            }
            return (T) aux.getDato();

        }
        return null;
    }

    public T eliminarFinal() {
        if (!vacia()) {
            if (raiz.getSiguiente() == null) {
                T dato=(T)raiz.getDato();
                raiz = null;
                return (T)dato;
            }else{
            Nodo aux = raiz;
            while (aux.getSiguiente().getSiguiente()!= null) {
                aux = aux.getSiguiente();
            }
            fin=aux;
            T dato=(T)aux.getSiguiente().getDato();
            aux.setSiguiente(null);
            return dato;
            }
        }

        return null;
    }
    
   
     public boolean buscar(T referencia){
        boolean existe = false;
         if(!vacia()){
          Nodo aux = raiz;
        while(existe ==false && aux != null){
        
            if (aux.getDato().equals(referencia)) {
                existe = true;
               
            }
            else{
                
                aux = aux.getSiguiente();
            }
        }
         }
        return existe;
    }

    @Override
    public String toString() {
         String muestra="";
        if(!vacia( )){
            Nodo aux=raiz;
            while (aux!=null) {
                aux=aux.getSiguiente();
                muestra=aux.getDato()+" ";
            }
        }
        return muestra;
       
    }
    
   public Nodo getRaiz(){
       
       return  raiz;
   }
   
   public T getTope(){
       return (T) raiz.getDato();
   }

 
    public int getTamanio(){
        return tamanio;
    }
    
    public void borrarLista(){
        raiz=null;
        tamanio=0;
    }

    public T getFin() {
        return (T) fin.getDato();
    }
   
    
    
}




