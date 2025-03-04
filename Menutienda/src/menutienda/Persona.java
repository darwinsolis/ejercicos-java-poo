package menutienda;
public class Persona {
    private String nombre;
    private boolean esEmpleado;

    public Persona(String nombre, boolean esEmpleado) {
        this.nombre = nombre;
        this.esEmpleado = esEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }

    public boolean puedeAcceder() {
        return false; 
    }
}
