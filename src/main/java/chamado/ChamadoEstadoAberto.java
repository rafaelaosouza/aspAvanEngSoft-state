package chamado;

public class ChamadoEstadoAberto extends ChamadoEstado {

    private ChamadoEstadoAberto() {};
    private static ChamadoEstadoAberto instance = new ChamadoEstadoAberto();
    public static ChamadoEstadoAberto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aberto";
    }

    public boolean investigar(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoEmInvestigacao.getInstance());
        return true;
    }

}
