package clases_trabajo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ignac
 */
public class Aire {
    protected ICA ica; 
    protected float saturacion_Co2;
    protected String clasificacion_Co2;
    protected int ppm_Co2;
    protected int temperatura; 

    public Aire (ICA ica, float saturacion_Co2, String clasificacion_Co2,int ppm_Co2, int temperatura) {
        this.ica = ica;
        this.saturacion_Co2 = saturacion_Co2;
        this.clasificacion_Co2 = clasificacion_Co2;
        this.ppm_Co2 = ppm_Co2;
        this.temperatura = temperatura;
    }

    Aire() {
        
    }
        
    public ICA getICA(){
        return ica;
    }
    
    public float getSaturacion_Co2() {
        return saturacion_Co2;
    }
    
    public String getClasificacion_Co2 () {
        return clasificacion_Co2;
    }
    
    public int getppm_Co2 (){
        return ppm_Co2;
    }
    
    public int getTemperatura (){
        return temperatura;
    }
    

    public void setIca(ICA ica) {
        this.ica = ica;
    }

    public void setSaturacion_Co2(float saturacion_Co2) {
        this.saturacion_Co2 = saturacion_Co2;
    }

    public void setClasificacion_Co2(String clasificacion_Co2) {
        this.clasificacion_Co2 = clasificacion_Co2;
    }
    

    public void setPPM_Co2(int PPM_Co2) {
        this.ppm_Co2 = PPM_Co2;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    public float obtenerSaturacion_Co2 (){
        float porcentaje = (ppm_Co2 / 10000f) * 100f;
        return porcentaje;
    }

    @Override
    public String toString() {
        return "Aire{" + "ica=" + ica + ", saturacion_Co2=" + saturacion_Co2 + ", clasificacion_Co2=" + clasificacion_Co2 + ", PPM_Co2=" + ppm_Co2 + ", temperatura=" + temperatura + '}';
    }
        
}