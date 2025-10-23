/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_trabajo;


/**
 *
 * @author ignac
 */
public class Calificador {
    protected String clasificacion_T_Co2;
    protected float clasificacion_N_ICA;
    protected String clasificacion_T_ICA;
    protected String clasificacion_T;
    protected float saturacion_Co2;
    protected ListaRecomendaciones listaRe;
    
    public Calificador(){
        
    }


    public String getClasificacion_t_Co2() {
        return clasificacion_T_Co2;
    }

    public void setClasificacion_t_Co2(String clasificacion_t_Co2) {
        this.clasificacion_T_Co2 = clasificacion_t_Co2;
    }

    public float getClasificacion_n_ICA() {
        return clasificacion_N_ICA;
    }

    public String getClasificacion_t_ICA() {
        return clasificacion_T_ICA;
    }

    public String getClasificacion_t() {
        return clasificacion_T;
    }

    public void setClasificacion_t(String clasificacion_t) {
        this.clasificacion_T = clasificacion_t;
    }
    

    public void setClasificacion_t_ICA(String clasificacion_t_ICA) {
        this.clasificacion_T_ICA = clasificacion_t_ICA;
    }
    

    public void setClasificacion_n_ICA(float clasificacion_n_ICA) {
        this.clasificacion_N_ICA = clasificacion_n_ICA;
    }

    public float getSaturacion_Co2() {
        return saturacion_Co2;
    }

    public void setSaturacion_Co2(float saturacion_Co2) {
        this.saturacion_Co2 = saturacion_Co2;
    }

    public ListaRecomendaciones getListaRe() {
        return listaRe;
    }

    public void setListaRe(ListaRecomendaciones listaRe) {
        this.listaRe = listaRe;
    }
    private static final String[] NIVELES_PELIGRO_TEXTO = {
        "N/A",               // Índice 0 (No usado)
        "Muy bueno",         // Índice 1 (Menos Peligro)
        "Bueno",             // Índice 2
        "Ligeramente Bueno", // Índice 3
        "Ligeramente Malo",  // Índice 4
        "Malo",              // Índice 5
        "Peligro"            // Índice 6 (Más Peligro)
    };
    
    public void calcularClasificacionT_CO2 () {     
        if (saturacion_Co2 >= 0f && saturacion_Co2 <= 0.04f) {
           this.clasificacion_T_Co2 = "Muy bueno";
        }
        else if (saturacion_Co2 > 0.04f && saturacion_Co2 <= 0.1f) {
           this.clasificacion_T_Co2 = "Bueno";
        }
        else if (saturacion_Co2 > 0.1f && saturacion_Co2 <= 0.2f) {
           this.clasificacion_T_Co2 = "Ligeramente Bueno";
        }
        else if (saturacion_Co2 > 0.2f && saturacion_Co2 <= 0.5f) {
           this.clasificacion_T_Co2 = "Ligeramente Malo";
        }
        else if (saturacion_Co2 > 0.5f && saturacion_Co2 <= 5f){
           this.clasificacion_T_Co2 = "Malo";
        }
        else if (saturacion_Co2 > 5f){
           this.clasificacion_T_Co2 = "Peligro";
        }
    }
    public void calcularClasificacionT_ICA () {     
        if (clasificacion_N_ICA >= 0f && clasificacion_N_ICA <= 50f) {
           this.clasificacion_T_ICA = "Muy bueno";
        }
        else if (clasificacion_N_ICA > 50f && clasificacion_N_ICA <= 100f) {
           this.clasificacion_T_ICA = "Bueno";
        }
        else if (clasificacion_N_ICA > 100f && clasificacion_N_ICA <= 150f) {
           this.clasificacion_T_ICA = "Ligeramente Bueno";
        }
        else if (clasificacion_N_ICA > 150f && clasificacion_N_ICA <= 200f) {
           this.clasificacion_T_ICA = "Ligeramente Malo";
        }
        else if (clasificacion_N_ICA > 200f && clasificacion_N_ICA <= 300f){
           this.clasificacion_T_ICA = "Malo";
        }
        else if (clasificacion_N_ICA > 300f){
           this.clasificacion_T_ICA = "Peligro";
        }
    }
    private int obtenerNivelPeligro(String clasificacion) {
        
        switch (clasificacion) {
            case "Muy bueno":
                return 1;
            case "Bueno":
                return 2;
            case "Ligeramente Bueno":
                return 3;
            case "Ligeramente Malo":
                return 4;
            case "Malo":
                return 5;
            case "Peligro":
                return 6;
            default:
                return 1;
        }
    }
    public void calcularClasificacion_t() {
        if (this.clasificacion_T_ICA == null || this.clasificacion_T_Co2 == null) {
            System.err.println("Error: Las clasificaciones de ICA y CO2 no han sido calculadas.");
            this.clasificacion_T = "N/A";
            return;
        }
        // 1. Obtener el nivel de peligro para cada sub-clasificación
        int nivelPeligroICA = obtenerNivelPeligro(this.clasificacion_T_ICA);
        int nivelPeligroCO2 = obtenerNivelPeligro(this.clasificacion_T_Co2);

        // 2. Determinar el nivel de peligro MÁXIMO (el peor caso)
        // Math.max devuelve el valor más grande, entre ambos indices (Lo que se nos pide como clasificacion final)
        int nivelPeligroMaximo = Math.max(nivelPeligroICA, nivelPeligroCO2);

        // 3. Convertir el nivel de peligro MÁXIMO de vuelta a la clasificación textual
        if (nivelPeligroMaximo >= 1 && nivelPeligroMaximo < NIVELES_PELIGRO_TEXTO.length) {
            // Usamos el nivel máximo como índice para obtener el texto del array
            this.clasificacion_T = NIVELES_PELIGRO_TEXTO[nivelPeligroMaximo];
        }
    }
    @Override  
    public String toString() {
        return "Calificador{" + "clasificacion_t_Co2=" + clasificacion_T_Co2 + ", clasificacion_n_ICA=" + clasificacion_N_ICA + ", clasificacion_t_ICA=" + clasificacion_T_ICA + ", clasificacion_t=" + clasificacion_T + ", saturacion_Co2=" + saturacion_Co2 + ", listaRe=" + listaRe + '}';
    }
    
}
