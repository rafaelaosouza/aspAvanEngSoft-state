package chamado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChamadoTest {

    Chamado chamado;

    @BeforeEach
    public void setUp() {
        chamado = new Chamado();
    }

    @Test
    public void deveInvestigarChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertTrue(chamado.investigar());
        assertEquals(ChamadoEstadoEmInvestigacao.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDeveConterChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertFalse(chamado.conter());
    }

    @Test
    public void naoDeveResolverChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void naoDeveReabrirChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertFalse(chamado.reabrir());
    }

    @Test
    public void naoDeveInvestigarChamadoEmInvestigacao() {
        chamado.setEstado(ChamadoEstadoEmInvestigacao.getInstance());
        assertFalse(chamado.investigar());
    }

    @Test
    public void deveConterChamadoEmInvestigacao() {
        chamado.setEstado(ChamadoEstadoEmInvestigacao.getInstance());
        assertTrue(chamado.conter());
        assertEquals(ChamadoEstadoContido.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDeveResolverChamadoEmInvestigacao() {
        chamado.setEstado(ChamadoEstadoEmInvestigacao.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void naoDeveReabrirChamadoEmInvestigacao() {
        chamado.setEstado(ChamadoEstadoEmInvestigacao.getInstance());
        assertFalse(chamado.reabrir());
    }

    @Test
    public void deveInvestigarChamadoContido() {
        chamado.setEstado(ChamadoEstadoContido.getInstance());
        assertTrue(chamado.investigar());
        assertEquals(ChamadoEstadoEmInvestigacao.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDeveConterChamadoContido() {
        chamado.setEstado(ChamadoEstadoContido.getInstance());
        assertFalse(chamado.conter());
    }

    @Test
    public void deveResolverChamadoContido() {
        chamado.setEstado(ChamadoEstadoContido.getInstance());
        assertTrue(chamado.resolver());
        assertEquals(ChamadoEstadoResolvido.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDeveReabrirChamadoContido() {
        chamado.setEstado(ChamadoEstadoContido.getInstance());
        assertFalse(chamado.reabrir());
    }

    @Test
    public void naoDeveInvestigarChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.investigar());
    }

    @Test
    public void naoDeveConterChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.conter());
    }

    @Test
    public void naoDeveResolverChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void deveReabrirChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertTrue(chamado.reabrir());
        assertEquals(ChamadoEstadoReaberto.getInstance(), chamado.getEstado());
    }

    @Test
    public void deveInvestigarChamadoReaberto() {
        chamado.setEstado(ChamadoEstadoReaberto.getInstance());
        assertTrue(chamado.investigar());
        assertEquals(ChamadoEstadoEmInvestigacao.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDeveConterChamadoReaberto() {
        chamado.setEstado(ChamadoEstadoReaberto.getInstance());
        assertFalse(chamado.conter());
    }

    @Test
    public void naoDeveResolverChamadoReaberto() {
        chamado.setEstado(ChamadoEstadoReaberto.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void naoDeveReabrirChamadoReaberto() {
        chamado.setEstado(ChamadoEstadoReaberto.getInstance());
        assertFalse(chamado.reabrir());
    }

}
