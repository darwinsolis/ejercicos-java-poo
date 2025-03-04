
package airecondicionado;


class Humedad {
    private Sensor sensor;

    public Humedad(double valor) {
        this.sensor = new Sensor(valor); 
    }

    public double obtenerHumedad() {
        return sensor.leer(); 
    }
}

