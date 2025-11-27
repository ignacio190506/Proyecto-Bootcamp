/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_trabajo;

/**
 *
 * @author ignac
 */
public class Elemento extends Material {
    protected String nombre; 
    protected int numeroAtomico; 
    protected int cantidadPorMolecula; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroatomico() {
        return numeroAtomico;
    }

    public void setNumeroatomico(int numeroatomico) {
        this.numeroAtomico = numeroatomico;
    }

    public int getCantidadpormolecula() {
        return cantidadPorMolecula;
    }

    public void setCantidadpormolecula(int cantidadpormolecula) {
        this.cantidadPorMolecula = cantidadpormolecula;
    }

    @Override
    public void metodo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Elemento{" + "nombre=" + nombre + ", masaatomica=" + masaAtomica + ", radioatomico=" + radioAtomico + ", numeroatomico=" + numeroAtomico + ", cantidadpormolecula=" + cantidadPorMolecula + '}';
    }
    
}
