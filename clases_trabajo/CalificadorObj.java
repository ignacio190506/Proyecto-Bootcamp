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
public class CalificadorObj {
        protected ArrayList<Calificador> listaCalificador;
    
   public CalificadorObj(){
       listaCalificador = new ArrayList<>();
   }
   public String agregarRangos(Calificador m){
       listaCalificador.add(m);
       return "Calificación agregada";
   }
   public String eliminarRangos(Calificador m){
       listaCalificador.remove(m);
       return "Calificación eliminada";
   }
   public ArrayList<Calificador> obtenerRegistros() {
        return this.listaCalificador;
    }
}
