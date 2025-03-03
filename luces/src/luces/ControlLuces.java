package luces;

public class ControlLuces {

    private boolean lucesEncendidas;

    public ControlLuces() {
        lucesEncendidas = false; 
    }

    public void encenderLuces() {
        lucesEncendidas = true;
        System.out.println("Las luces estan ENCENDIDAS.");
    }

    public void apagarLuces() {
        lucesEncendidas = false;
        System.out.println("Las luces estan APAGADAS.");
    }

    public boolean obtenerEstadoLuces() {
        return lucesEncendidas;
    }
}
