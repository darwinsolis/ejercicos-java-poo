
package sistemaseguridad;

public class SistemaSeguridad {

    private SensorMovimiento sensor1;
    private SensorMovimiento sensor2;
    private SensorMovimiento sensor3;
    private boolean alarmaActivada;
    private boolean esDeNoche;

    public SistemaSeguridad() {
        sensor1 = new SensorMovimiento();
        sensor2 = new SensorMovimiento();
        sensor3 = new SensorMovimiento();
        alarmaActivada = false;
        esDeNoche = false; 
    }

    public void activarAlarma() {
        alarmaActivada = true;
        System.out.println("¡ALERTA! Alarma activada.");
    }

    public void desactivarAlarma() {
        alarmaActivada = false;
        System.out.println("La alarma está desactivada.");
    }

    public void verificarSensores() {
    
        boolean movimiento1 = sensor1.detectarMovimiento();
        boolean movimiento2 = sensor2.detectarMovimiento();
        boolean movimiento3 = sensor3.detectarMovimiento();

        int sensoresConMovimiento = 0;
        if (movimiento1) sensoresConMovimiento++;
        if (movimiento2) sensoresConMovimiento++;
        if (movimiento3) sensoresConMovimiento++;

        if (sensoresConMovimiento >= 2 && esDeNoche) {
            activarAlarma();
        } else {
            desactivarAlarma();
        }

        System.out.println("Sensor 1: " + (movimiento1 ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Sensor 2: " + (movimiento2 ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Sensor 3: " + (movimiento3 ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Estado de la alarma: " + (alarmaActivada ? "Activada" : "Desactivada"));
    }

    public void establecerHorario(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }
}

