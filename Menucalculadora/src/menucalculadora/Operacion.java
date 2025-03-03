
package menucalculadora;


public class Operacion {

   
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

  
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre 0.");
            return Double.NaN;  
        }
        return num1 / num2;
    }
}
