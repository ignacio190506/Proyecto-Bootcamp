/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_trabajo;



/**
 *
 * @author ignac
 */
import java.util.ArrayList;
public class ListaComponentes {
    protected ArrayList<Componente> listaComponentes;
    
   public ListaComponentes(){
       listaComponentes = new ArrayList<>();
   }
   public String agregarComponente(Componente m){
       listaComponentes.add(m);
       return "Componente agregado";
   }
   public String eliminarComponente(Componente m){
       listaComponentes.remove(m);
       return "Componente eliminado";
   }
}
