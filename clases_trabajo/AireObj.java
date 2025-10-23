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
public class AireObj {
    protected ArrayList<Aire> listaAires;

    public AireObj() {
        listaAires = new ArrayList<>();
    }
    
    public String agregarAires(Aire a){
        listaAires.add(a);
        return "Aire Agregado";
    }
    public String eliminarAires(Aire a){
        listaAires.remove(a);
        return "Aire Eliminado";
    }
    public ArrayList<Aire> obtenerRegistros() {
        return this.listaAires;
    }
}
