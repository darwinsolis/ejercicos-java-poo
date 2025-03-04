
package airecondicionado;


class AireAcondicionado {
    
    private String estado;

    public AireAcondicionado() {
        this.estado = "Apagado";
    }

    public void activar() {
        estado = "Encendido";
    }

    public void desactivar() {
        estado = "Apagado";
    }

    public String obtenerEstado() {
        return estado;
    }
}

