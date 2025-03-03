
package menucalculadora;


public class Calculadora {

    private Operacion operacion;

    public Calculadora() {
        this.operacion = new Operacion();
    }

    
    public double sumar(double num1, double num2) {
        return operacion.sumar(num1, num2);
    }

    public double restar(double num1, double num2) {
        return operacion.restar(num1, num2);
    }
    
    public double multiplicar(double num1, double num2) {
        return operacion.multiplicar(num1, num2);
    }

  
    public double dividir(double num1, double num2) {
        return operacion.dividir(num1, num2);
    }
}
