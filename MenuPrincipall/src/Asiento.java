package menuprincipall;
public class Asiento {
    private int numero;
    private boolean disponible;


    public Asiento(int numero) {
        this.numero = numero;
        this.disponible = true;  
    }
    
    public void reservar() {
        if (disponible) {
            disponible = false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
