package menuprincipall;

public class Sala {
    private int capacidad;
    private Asiento[] asientos;
    private int reservasRealizadas;

    
    public Sala(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new Asiento[capacidad];
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new Asiento(i + 1);  
        }
        this.reservasRealizadas = 0;
    }

    public void mostrarAsientos() {
        for (Asiento asiento : asientos) {
            String estado = asiento.isDisponible() ? "Disponible" : "Ocupado";
            System.out.println("Asiento " + asiento.getNumero() + ": " + estado);
        }
    }

    public void reservarAsiento(int numeroAsiento) {
        if (numeroAsiento < 1 || numeroAsiento > capacidad) {
            System.out.println("Número de asiento inválido.");
        } else {
            Asiento asiento = asientos[numeroAsiento - 1];
            if (asiento.isDisponible()) {
                asiento.reservar();
                reservasRealizadas++;
                System.out.println("Asiento " + numeroAsiento + " reservado exitosamente.");
            } else {
                System.out.println("Asiento " + numeroAsiento + " ya esta ocupado.");
            }
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getReservasRealizadas() {
        return reservasRealizadas;
    }
}
