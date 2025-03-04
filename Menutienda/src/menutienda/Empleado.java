
package menutienda;


public class Empleado extends Persona {
    public Empleado(String nombre) {
        super(nombre, true);  
    }

    public boolean puedeAcceder() {
        return true;  
    }
}

