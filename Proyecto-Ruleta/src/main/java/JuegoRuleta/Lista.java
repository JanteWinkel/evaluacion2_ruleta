/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoRuleta;

/**
 *
 * @author Dell
 */
public class Lista {

    Nodo L, U;
    Nodo aux;
    
public Lista(){
    
    L = null;
    U = null;
}

public void insertar(String pdato){
        Nodo nuevo = new Nodo();
        nuevo.dato=pdato;
        nuevo.sig=null;

        if (L==null){
            L=nuevo;
            L.sig = null;
            U = L;
        }
    else {
        U.sig = nuevo;
        nuevo.sig = null;
        U = nuevo;
        
    }
    }

      public void mostrar(){
          
          aux=L;
        String dato="";
        while (aux !=null)
        {
            System.out.println(aux.dato);
            aux=aux.sig;
        }
       
    }
       

}