package rh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoEmpresaTest {

    @Test
    public void deveRetornarNomeEmpresa() {
        ConfiguracaoEmpresa.getInstance().setNomeEmpresa("Empresa 1");
        assertEquals("Empresa 1", ConfiguracaoEmpresa.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        ConfiguracaoEmpresa.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", ConfiguracaoEmpresa.getInstance().getUsuarioLogado());
    }

}
