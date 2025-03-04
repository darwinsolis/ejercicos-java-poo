
package airecondicionado;

import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AireAcondicionado aireAcondicionado = new AireAcondicionado();
        Temperatura temperatura = new Temperatura(25);  
        Humedad humedad = new Humedad(50);  
        Controlador controlador = new Controlador(temperatura, humedad, aireAcondicionado);

        while (true) {
            
            System.out.println("\n=== Menu ===");
            System.out.println("1. Ingresar valores manualmente (temperatura y humedad)");
            System.out.println("2. Verificar estado del aire acondicionado");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controlador.ingresarDatos(); 
                    break;
                case 2:
                    controlador.verificarEstado(); 
                    controlador.mostrarEstado();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    return; 
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        }
    }
}




    
