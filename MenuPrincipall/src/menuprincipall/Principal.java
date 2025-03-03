package menuprincipall;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Mantener un solo scanner

        int opcion;

        do {
            System.out.println("Bienvenido a tus ejercicios.");
            System.out.println("Selecciona una opción para resolver un ejercicio:");
            System.out.println("1. Resolver ejercicio de reservas de asientos");
            System.out.println("2. Volver a hacer otro ejercicio");
            System.out.println("3. Salir");
            System.out.print("Introduce una opción (1-3): ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    resolverEjercicioReservas(scanner);  // Pasar scanner a la función
                    break;
                case 2:
                    System.out.println("Vamos a resolver otro ejercicio...");
                    break;
                case 3:
                    System.out.println("Gracias por usar el solucionador.... !!!!Hasta pronto!!!!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige entre 1 y 3.");
                    break;
            }
        } while (opcion != 3);
        
        scanner.close();
    }

    public static void resolverEjercicioReservas(Scanner scanner) {
        // Cambié la capacidad de la sala a 6
        Sala sala = new Sala(6);  

        Persona persona1 = new Persona("Juan Pablo");
        Persona persona2 = new Persona("Anasofia");

        Cine cine = new Cine();

        cine.mostrarEstado(sala);

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
                System.out.println("Número de asiento invalido. Por favor ingrese un numero entre 1 y " + sala.getCapacidad());
            }

            // Mostrar estado actualizado de la sala  
            cine.mostrarEstado(sala);
        }

        System.out.println("\n¡La sala está llena! No se pueden realizar más reservas.");
    }
}
