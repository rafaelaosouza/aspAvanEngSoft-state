package chamado;

public class Chamado {

    private String titulo;
    private ChamadoEstado estado;

    public Chamado() {
        this.estado = ChamadoEstadoAberto.getInstance();
    }

    public void setEstado(ChamadoEstado estado) {
        this.estado = estado;
    }

    public boolean investigar() {
        return estado.investigar(this);
    }

    public boolean conter() {
        return estado.conter(this);
    }

    public boolean resolver() {
        return estado.resolver(this);
    }

    public boolean reabrir() {
        return estado.reabrir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ChamadoEstado getEstado() {
        return estado;
    }
}
