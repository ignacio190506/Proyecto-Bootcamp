/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_trabajo;

/**
 *
 * @author ignac
 */
public abstract class Material implements Interface1 {
    protected int radioAtomico;
    protected int masaAtomica;

    public Material(int radioatomico, int masaatomica) {
        this.radioAtomico = radioatomico;
        this.masaAtomica = masaatomica;
    }

    public Material() {
        
    }
    
    public int getRadioatomico() {
        return radioAtomico;
    }

    public void setRadioatomico(int radioatomico) {
        this.radioAtomico = radioatomico;
    }

    public int getMasaatomica() {
        return masaAtomica;
    }
//
    public void setMasaatomica(int masaatomica) {
        this.masaAtomica = masaatomica;
    }
    
    public abstract void metodo();

    @Override
    public String toString() {
        return "Material{" + "radioatomico=" + radioAtomico + ", masaatomica=" + masaAtomica + '}';
    }
    
    
}

