
package airecondicionado;

public class Temperatura {
    private Sensor sensor;

    public Temperatura(double valor) {
        this.sensor = new Sensor(valor); 
    }

    public double obtenerTemperatura() {
        return sensor.leer(); 
    }
}
