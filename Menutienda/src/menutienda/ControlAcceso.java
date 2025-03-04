package menutienda;

import java.time.LocalTime;

public class ControlAcceso {

    public boolean verificarAcceso(Persona persona) {
    
        return persona.puedeAcceder();
    }
}
