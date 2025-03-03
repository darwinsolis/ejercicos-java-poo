
package sistemaseguridad;

import java.util.Scanner;

public class MenuSeguridad {

    private SistemaSeguridad sistemaSeguridad;
    private Scanner scanner;

    public MenuSeguridad() {
        sistemaSeguridad = new SistemaSeguridad();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nSistema de Seguridad - Detección de Intrusos");
            System.out.println("1. Activar alarma");
            System.out.println("2. Desactivar alarma");
            System.out.println("3. Simular sensores y ver estado");
            System.out.println("4. Establecer si es de noche (activar/deactivar)");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sistemaSeguridad.activarAlarma();
                    break;
                case 2:
                    sistemaSeguridad.desactivarAlarma();
                    break;
                case 3:
                    sistemaSeguridad.verificarSensores();
                    break;
                case 4:
                    System.out.print("¿Es de noche? (true/false): ");
                    boolean esDeNoche = scanner.nextBoolean();
                    sistemaSeguridad.establecerHorario(esDeNoche);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige entre 1 y 5.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}
