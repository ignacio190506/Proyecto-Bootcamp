/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_trabajo;


/**
 *
 * @author ignac
 */
public class Lugar {
    protected String clasificación;
    protected int poblacion; 
    protected String urbanización; 
    protected int ID; 
    protected Aire aire;
    protected ListaRecomendaciones listaRe;
    
// Constructors
    public Lugar() {
        
    }
    
    public Lugar(String clasificación, int poblacion, String urbanización, int ID, Aire aire, ListaRecomendaciones listaRe) {
        this.clasificación = clasificación;
        this.poblacion = poblacion;
        this.urbanización = urbanización;
        this.ID = ID;
        this.aire = aire;
        this.listaRe = listaRe;
    }
    
// Getter
    
    public String getClasificación() {
        return clasificación;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public String getUrbanización() {
        return urbanización;
    }

    public int getID() {
        return ID;
    }

    public Aire getAire() {
        return aire;
    }
    public ListaRecomendaciones getListare() {
        return listaRe;
    }

// Setter

    public void setClasificación(String clasificación) {
        this.clasificación = clasificación;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setUrbanización(String urbanización) {
        this.urbanización = urbanización;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAire(Aire aire) {
        this.aire = aire;
    }
    
    public void setListaRe(ListaRecomendaciones listaRe) {
        this.listaRe = listaRe;
    }

    @Override
    public String toString() {
        return "Lugar{" + "clasificaci\u00f3n=" + clasificación + ", poblacion=" + poblacion + ", urbanizaci\u00f3n=" + urbanización + ", ID=" + ID + ", aire=" + aire + '}';
    }
    
}
