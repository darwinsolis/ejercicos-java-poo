package menuprincipall;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
  
        Sala sala = new Sala(5);

        Persona persona1 = new Persona("Juan Pablo");
        Persona persona2 = new Persona("Anasofia");

      
        Cine cine = new Cine();

        cine.mostrarEstado(sala);

        Scanner scanner = new Scanner(System.in);

        while (sala.getReservasRealizadas() < sala.getCapacidad()) {
            System.out.print("Ingresa el numero de asiento para reservar (1-" + sala.getCapacidad() + "): ");
            int numeroAsiento = scanner.nextInt();

            if (numeroAsiento >= 1 && numeroAsiento <= sala.getCapacidad()) {

                if (sala.getReservasRealizadas() % 2 == 0) {
                    persona1.hacerReserva(sala, numeroAsiento);
                } else {
                    persona2.hacerReserva(sala, numeroAsiento);
                }
            } else {
                System.out.println("Numero de asiento invalido. Por favor ingrese un numero entre 1 a 3 " + sala.getCapacidad());
            }

          
            cine.mostrarEstado(sala);
        }

        System.out.println("\n¡La sala esta llena! No se pueden realizar mas reservas.");

      
        scanner.close();
    }
}
