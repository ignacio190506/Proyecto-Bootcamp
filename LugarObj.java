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
public class LugarObj {
    protected ArrayList<Lugar> listaLugares;

    public LugarObj() {
        listaLugares = new ArrayList<>();
    }
    
    public String agregarLugares(Lugar l){
        listaLugares.add(l);
        return "Lugar Agregado";
    }
    public String eliminarLugares(Lugar l){
        listaLugares.remove(l);
        return "Lugar Eliminado";
    }
    public ArrayList<Lugar> obtenerRegistros() {
        return this.listaLugares;
    }
}