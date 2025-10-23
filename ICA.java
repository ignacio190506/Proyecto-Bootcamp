/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_trabajo;

/**
 *
 * @author ignac
 */
public class ICA {
    protected float pm10;
    protected float pm25;
    protected ListaComponentes lista;
    protected float clasificacion_N;
    protected String clasificacion_T;
    
    public ICA() {
        
    }

    public float getPm10() {
        return pm10;
    }

    public float getPm25() {
        return pm25;
    }

    public float getClasificacion_N() {
        return clasificacion_N;
    }

    public String getClasificacion_T() {
        return clasificacion_T;
    }

    public ListaComponentes getLista() {
        return lista;
    }
    
    public void setLista(ListaComponentes lista) {
        this.lista = lista;
    }

    public void setPm10(float pm10) {
        this.pm10 = pm10;
    }

    public void setPm25(float pm25) {
        this.pm25 = pm25;
    }

    public void setClasificacion_N(float clasificacion_N) {
        this.clasificacion_N = clasificacion_N;
    }

    public void setClasificacion_T(String clasificacion_T) {
        this.clasificacion_T = clasificacion_T;
    }
    
    private float obtenerConcentracion (String nombrecomponente) {
        for (Componente c: lista.listaComponentes) {
            if (c.getNombre().equalsIgnoreCase(nombrecomponente)) {
                return c.getConcentracion();
            }
        }
        return 0;
    }
    public float calcularClasificacion_N () {
        float calculopm = (pm10 * 0.25f) + (pm25 * 0.35f);
        float no2 = obtenerConcentracion("NO2");
        float so2 = obtenerConcentracion("SO2");
        float o3 = obtenerConcentracion("O3");
        float calculofinal = calculopm + (so2 * 0.15f) + (no2 * 0.15f) + (o3 * 0.10f);
        return calculofinal;
    }

    @Override
    public String toString() {
        return "ICA{" + "pm10=" + pm10 + ", pm25=" + pm25 + ", lista=" + lista + ", clasificacion_N=" + clasificacion_N + ", clasificacion_T=" + clasificacion_T + '}';
    }
    
    
}

