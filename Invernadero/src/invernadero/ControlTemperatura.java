package invernadero;

import java.util.Scanner;

public class ControlTemperatura {

    private Invernadero invernadero;
    private Scanner scanner;

    public ControlTemperatura() {
        invernadero = new Invernadero();
        scanner = new Scanner(System.in);
    }

    public void controlarTemperatura() {
        while (true) { 
            System.out.print("Ingresa la temperatura actual del invernadero (°C): ");
            double temperatura = scanner.nextDouble();
            System.out.println("Temperatura actual: " + temperatura + "°C");

            if (temperatura < 10) {
                invernadero.activarCalefactor();
            } else if (temperatura > 25) {
                invernadero.activarVentilador();
            } else {
                invernadero.desactivar();  
            }

            invernadero.mostrarEstado();

            System.out.println("¿Quieres ingresar otra temperatura? (si/no): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("Saliendo del sistema...");
                break;
            }
        }
    }
}
