
package sistemaseguridad;

import java.util.Random;

public class SensorMovimiento {

    
    public boolean detectarMovimiento() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
