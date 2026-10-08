package chamado;

public class ChamadoEstadoReaberto extends ChamadoEstado {

    private ChamadoEstadoReaberto() {};
    private static ChamadoEstadoReaberto instance = new ChamadoEstadoReaberto();
    public static ChamadoEstadoReaberto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Reaberto";
    }

    public boolean investigar(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoEmInvestigacao.getInstance());
        return true;
    }

}
