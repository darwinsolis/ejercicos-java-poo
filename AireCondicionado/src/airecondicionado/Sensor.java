
package airecondicionado;

public class Sensor {
    private double valor;

    public Sensor(double valor) {
        this.valor = valor;
    }

    public double leer() {
        return valor;
    }
}

