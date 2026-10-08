package chamado;

public class ChamadoEstadoContido extends ChamadoEstado {

    private ChamadoEstadoContido() {};
    private static ChamadoEstadoContido instance = new ChamadoEstadoContido();
    public static ChamadoEstadoContido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contido";
    }

    public boolean investigar(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoEmInvestigacao.getInstance());
        return true;
    }

    public boolean resolver(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        return true;
    }

}
