
package menuprincipall;

public class Usuario {
    private String nombre;

 
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

  
    public void hacerReserva(Sala sala, int numeroAsiento) {
        System.out.println(nombre + " intenta reservar el asiento " + numeroAsiento + ".");
        sala.reservarAsiento(numeroAsiento);
    }
}
