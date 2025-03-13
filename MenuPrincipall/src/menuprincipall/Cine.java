package menuprincipall;

public class Cine {
    private Sala sala;

    public Cine() {
        this.sala = new Sala(6);  // La capacidad de la sala está definida aquí también, pero no es necesario cambiarlo
    }

    public void mostrarEstado(Sala sala) {
        sala.mostrarAsientos();
    }
}
