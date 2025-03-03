package invernadero;

public class Invernadero {

    private boolean calefactorEncendido;
    private boolean ventiladorEncendido;

    public Invernadero() {
        this.calefactorEncendido = false;
        this.ventiladorEncendido = false;
    }

    public void activarCalefactor() {
        calefactorEncendido = true;
        ventiladorEncendido = false;
    }

    public void activarVentilador() {
        calefactorEncendido = false;
        ventiladorEncendido = true;
    }

    public void desactivar() {
        calefactorEncendido = false;
        ventiladorEncendido = false;
    }

    public void mostrarEstado() {
        if (calefactorEncendido) {
            System.out.println("Calefactor activado.");
        } else if (ventiladorEncendido) {
            System.out.println("Ventilador activado.");
        } else {
            System.out.println("Sistema inactivo.");
        }
    }
}
