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
public class ComponentesObj {
    protected ArrayList<Componente> listaComponentes;

    public ComponentesObj() {
        listaComponentes = new ArrayList<>();
    }
    
    public String agregarComponentes(Componente c){
        listaComponentes.add(c);
        return "Componente Agregado";
    }
    public String eliminarComponentes(Componente c){
        listaComponentes.remove(c);
        return "Componente Eliminado";
    }
    public ArrayList<Componente> obtenerRegistros() {
        return this.listaComponentes;
    }
}
