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
public class ListaRecomendaciones {
    protected ArrayList<String>listarecomendaciones;
    
   public ListaRecomendaciones(){
       listarecomendaciones = new ArrayList<>();
   }
   public String agregarRecomendaciones(String m){
       listarecomendaciones.add(m);
       return "Recomendación agregada";
   }
   public String eliminarRecomendaciones(String m){
       listarecomendaciones.remove(m);
       return "Recomendación eliminada";
   }
   
   public ArrayList<String> obtenerRecomendaciones(){
       return this.listarecomendaciones;
   }
}
