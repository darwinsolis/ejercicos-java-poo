
package sistemaseguridad;
import java.util.Random;

class SensorMovimiento {
    public boolean detectarMovimiento() {
        Random random = new Random();
        return random.nextBoolean(); 
    }
}


