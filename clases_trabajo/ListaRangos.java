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
public class ListaRangos {
    protected ArrayList<Integer> listarangos;
    
   public ListaRangos(){
       listarangos = new ArrayList<>();
   }
   public String agregarRangos(Integer m){
       listarangos.add(m);
       return "Rango agregado";
   }
   public String eliminarRangos(Integer m){
       listarangos.remove(m);
       return "Rango eliminado";
   }
}
