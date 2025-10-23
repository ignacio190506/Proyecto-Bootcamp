/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_trabajo;

/**
 *
 * @author ignac
 */
public class Componente extends Material {
    protected String nombre;
    protected ListaElementos lista;
    protected float concentracion;

    public Componente() {
        
    }
    public String getNombre() {
        return nombre;
    }

    public float getConcentracion() {
        return concentracion;
    }

    public ListaElementos getLista() {
        return lista;
    }

    public void setLista(ListaElementos lista) {
        this.lista = lista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setConcentracion(float concentracion) {
        this.concentracion = concentracion;
    }
    
    @Override
    public void metodo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Componente{" + "nombre=" + nombre + ", masaatomica=" + masaAtomica + ", lista=" + lista + ", radioatomico=" + radioAtomico + ", concentracion=" + concentracion + '}';
    }
    
    
}
