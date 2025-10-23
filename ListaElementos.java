/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_trabajo;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class ListaElementos {
    protected ArrayList<Elemento> listaElementos;
    
   public ListaElementos(){
       listaElementos = new ArrayList<>();
   }
   public String agregarComponente(Elemento m){
       listaElementos.add(m);
       return "Componente agregado";
   }
   public Elemento buscarElemento(String nombre) {
       for (Elemento e : listaElementos) {
           if (e.getNombre().equals(nombre)){
               return e;
           } 
       }
       return new Elemento();
   }
   public String eliminarComponente(Elemento m){
       listaElementos.remove(m);
       return "Componente eliminado";
   }
   
   public String eliminarComponenteconNombre (String nombre) {
       Elemento e = buscarElemento(nombre);
       if (e.getNombre().equals(nombre)){
           listaElementos.remove(e);
           return "Eliminado";
       }
       return "No encontrado";
   }
}
