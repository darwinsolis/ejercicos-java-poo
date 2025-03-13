package menuprincipall;
public class Persona {
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método para hacer una reserva
    public void hacerReserva(Sala sala, int numeroAsiento) {
        System.out.println(nombre + " intenta reservar el asiento " + numeroAsiento + ".");
        sala.reservarAsiento(numeroAsiento);
    }
}
