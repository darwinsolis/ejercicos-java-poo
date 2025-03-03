package invernadero;

import java.util.Scanner;

public class InvernaderoPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de control de temperatura del Invernadero.");
        System.out.println("Presiona 1 para comenzar a controlar la temperatura.");
        System.out.println("Presiona 2 para salir.");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Iniciando control de temperatura...");
            ControlTemperatura controlTemperatura = new ControlTemperatura();
            controlTemperatura.controlarTemperatura();
        } else if (opcion == 2) {
            System.out.println("Gracias por usar el sistema de control de temperatura.");
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
