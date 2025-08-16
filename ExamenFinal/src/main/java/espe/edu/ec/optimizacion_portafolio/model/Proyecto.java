package espe.edu.ec.arquitectura.optimizacion.model;

public class Proyecto {
    private String nombre;
    private int peso;
    private int ganancia;

    // Constructores
    public Proyecto() {}

    public Proyecto(String nombre, int peso, int ganancia) {
        this.nombre = nombre;
        this.peso = peso;
        this.ganancia = ganancia;
    }

    // Getters y Setters (generados con IntelliJ: Alt + Insert)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }

    public int getGanancia() { return ganancia; }
    public void setGanancia(int ganancia) { this.ganancia = ganancia; }
}
