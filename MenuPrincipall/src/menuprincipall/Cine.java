
package menuprincipall;

public class Cine {
    private Sala sala;

   
    public Cine() {
        this.sala = new Sala(5);  
    }

  
    public void mostrarEstado(Sala sala) {
        sala.mostrarAsientos();
    }
}
