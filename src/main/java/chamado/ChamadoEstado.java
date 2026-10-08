package chamado;

public abstract class ChamadoEstado {

    public abstract String getEstado();

    public boolean investigar(Chamado chamado) {
        return false;
    }

    public boolean conter(Chamado chamado) {
        return false;
    }

    public boolean resolver(Chamado chamado) {
        return false;
    }

    public boolean reabrir(Chamado chamado) {
        return false;
    }

}
