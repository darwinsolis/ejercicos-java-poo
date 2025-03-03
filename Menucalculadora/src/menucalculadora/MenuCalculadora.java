package menucalculadora;

import java.util.Scanner;

public class MenuCalculadora {

    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {
            
            System.out.println("Bienvenido a la Calculadora Simple");
            System.out.println("Elige una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.print("Introduce una opcion (1-5): ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Gracias por usar la calculadora. !!!!!Hasta pronto!");
                break;
            }

            // Solicitar los números para las operaciones
            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();

            // Variable para almacenar el resultado
            double resultado = 0;

            // Ejecutar la operación elegida
            switch (opcion) {
                case 1:
                    resultado = calculadora.sumar(num1, num2);
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = calculadora.restar(num1, num2);
                    System.out.println("Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    System.out.println("Resultado de la multiplicación: " + resultado);
                    break;
                case 4:
                    resultado = calculadora.dividir(num1, num2);
                    if (!Double.isNaN(resultado)) {
                        System.out.println("Resultado de la división: " + resultado);
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor elige entre 1 y 5.");
            }
        }

        scanner.close();
    }
}

