package chamado;

public class ChamadoEstadoEmInvestigacao extends ChamadoEstado {

    private ChamadoEstadoEmInvestigacao() {};
    private static ChamadoEstadoEmInvestigacao instance = new ChamadoEstadoEmInvestigacao();
    public static ChamadoEstadoEmInvestigacao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Investigação";
    }

    public boolean conter(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoContido.getInstance());
        return true;
    }

}
