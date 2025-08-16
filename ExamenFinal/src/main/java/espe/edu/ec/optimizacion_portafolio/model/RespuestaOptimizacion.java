package espe.edu.ec.arquitectura.optimizacion.model;

import java.util.List;

public class RespuestaOptimizacion {
    private List<String> seleccionados;
    private int gananciaTotal;
    private int pesoTotal;

    // Getters y Setters
    public List<String> getSeleccionados() { return seleccionados; }
    public void setSeleccionados(List<String> seleccionados) { this.seleccionados = seleccionados; }

    public int getGananciaTotal() { return gananciaTotal; }
    public void setGananciaTotal(int gananciaTotal) { this.gananciaTotal = gananciaTotal; }

    public int getPesoTotal() { return pesoTotal; }
    public void setPesoTotal(int pesoTotal) { this.pesoTotal = pesoTotal; }
}
