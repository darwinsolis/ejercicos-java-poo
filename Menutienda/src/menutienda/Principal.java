package menutienda;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ControlAcceso controlAcceso = new ControlAcceso();

        while (true) {
            System.out.println("\n--- Menú de Control de Acceso ---");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Empleado");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    
                    System.out.print("Ingrese nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();

                    System.out.print("El cliente tiene membresía? (sí/no): ");
                    String tieneMembresiaStr = scanner.nextLine().trim().toLowerCase();
                    boolean tieneMembresia = tieneMembresiaStr.equals("sí");

                    Cliente cliente = new Cliente(nombreCliente, tieneMembresia);
                    verificarAcceso(cliente, controlAcceso);
                    break;

                case 2:
            
                    System.out.print("Ingrese nombre del empleado: ");
                    String nombreEmpleado = scanner.nextLine();

                    Empleado empleado = new Empleado(nombreEmpleado);
                    verificarAcceso(empleado, controlAcceso);
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;  

                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
                    break;
            }
        }
    }

    private static void verificarAcceso(Persona persona, ControlAcceso controlAcceso) {
        boolean accesoPermitido = controlAcceso.verificarAcceso(persona);
        if (accesoPermitido) {
            System.out.println("Acceso permitido a " + persona.getNombre());
        } else {
            System.out.println("Acceso denegado a " + persona.getNombre());
        }
    }
}
