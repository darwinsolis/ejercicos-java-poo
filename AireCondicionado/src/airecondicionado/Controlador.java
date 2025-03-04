
package airecondicionado;

import java.util.Scanner;

public class Controlador {
    private Temperatura temperatura;
    private Humedad humedad;
    private AireAcondicionado aireAcondicionado;

    public Controlador(Temperatura temperatura, Humedad humedad, AireAcondicionado aireAcondicionado) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.aireAcondicionado = aireAcondicionado;
    }

    public void verificarEstado() {
        double temp = temperatura.obtenerTemperatura();
        double hum = humedad.obtenerHumedad();

  
        if ((temp > 28 && hum > 60) || (temp > 30)) {
            aireAcondicionado.activar();
        } else {
            aireAcondicionado.desactivar();
        }
    }

    public void mostrarEstado() {
        System.out.println("Temperatura: " + temperatura.obtenerTemperatura() + "°C");
        System.out.println("Humedad: " + humedad.obtenerHumedad() + "%");
        System.out.println("Aire Acondicionado: " + aireAcondicionado.obtenerEstado());
    }

    
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura (C): ");
        double temp = scanner.nextDouble();
        temperatura = new Temperatura(temp);

        System.out.print("Ingrese la humedad (%): ");
        double hum = scanner.nextDouble();
        humedad = new Humedad(hum);
    }
}
