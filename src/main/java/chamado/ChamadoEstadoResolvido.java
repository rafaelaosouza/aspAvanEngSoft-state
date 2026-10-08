package chamado;

public class ChamadoEstadoResolvido extends ChamadoEstado {

    private ChamadoEstadoResolvido() {};
    private static ChamadoEstadoResolvido instance = new ChamadoEstadoResolvido();
    public static ChamadoEstadoResolvido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Resolvido";
    }

    public boolean reabrir(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoReaberto.getInstance());
        return true;
    }

}
