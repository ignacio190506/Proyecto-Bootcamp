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
public class ICAObj {
    protected ArrayList<ICA> listaICAs;

    public ICAObj() {
        listaICAs = new ArrayList<>();
    }
    
    public String agregarICAS(ICA i){
        listaICAs.add(i);
        return "ICA Agregado";
    }
    public String eliminarICAS(ICA i){
        listaICAs.remove(i);
        return "ICA Eliminado";
    }
    public ArrayList<ICA> obtenerRegistros() {
        return this.listaICAs;
    }
}
