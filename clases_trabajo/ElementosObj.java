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
public class ElementosObj {
    protected ArrayList<Elemento> listaElementos;
    
   public ElementosObj(){
       listaElementos = new ArrayList<>();
   }
   public String agregarComponente(Elemento m){
       listaElementos.add(m);
       return "Componente agregado";
   }
   public String eliminarComponente(Elemento m){
       listaElementos.remove(m);
       return "Componente eliminado";
   }
    
   public ArrayList<Elemento> obtenerRegistros() {
        return this.listaElementos;
    }
}
