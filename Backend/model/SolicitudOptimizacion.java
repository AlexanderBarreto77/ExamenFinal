package espe.edu.ec.arquitectura.optimizacion.model;

import java.util.List;

public class SolicitudOptimizacion {
    private int capacidad;
    private List<Proyecto> objetos;

    // Getters y Setters
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public List<Proyecto> getObjetos() { return objetos; }
    public void setObjetos(List<Proyecto> objetos) { this.objetos = objetos; }
}
