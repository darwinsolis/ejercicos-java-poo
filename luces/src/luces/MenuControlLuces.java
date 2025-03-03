package luces;

import java.util.Scanner;

public class MenuControlLuces {

    private SistemaControlLuces sistemaControlLuces;
    private Scanner scanner;

    public MenuControlLuces() {
        sistemaControlLuces = new SistemaControlLuces();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nSistema de Control de Luces Automatico");
            System.out.println("1. Establecer si es de noche (activar / desactivar)");
            System.out.println("2. Simular control de luces");
            System.out.println("3. Salir");
            System.out.print("Elige una opción (1-3): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Es de noche? (Sí/No): ");
                    String entrada = scanner.next();
                    boolean esDeNoche = entrada.equalsIgnoreCase("Si");
                    sistemaControlLuces.establecerHorario(esDeNoche);
                    break;
                case 2:
                    sistemaControlLuces.verificarLuces();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no valida. Por favor, elige entre 1 y 3.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}
