package menujuego;

import java.util.Scanner;

public class Menujuego {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Introduce una opción (1-3): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    FizzBuzz.jugarFizzBuzz(); // Llama el método jugarFizzBuzz
                    break;
                case 2:
                    System.out.println("Volver a hacer otro ejercicio...");
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

    public static void mostrarMenu() {
        System.out.println("Bienvenido a tus ejercicios.");
        System.out.println("Selecciona una opción para resolver un ejercicio:");
        System.out.println("1. Resolver juego de FizzBuzz");
        System.out.println("2. Volver a hacer otro ejercicio");
        System.out.println("3. Salir");
    }
}
