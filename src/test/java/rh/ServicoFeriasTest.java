package rh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFeriasTest {

    @Test
    void deveExecutarFerias() {
        ConfiguracaoEmpresa.getInstance().setUsuarioLogado("Usuario 1");
        IServico servico = ServicoFactory.obterServico("Ferias");
        assertEquals("Férias efetivadas por Usuario 1", servico.executar());
    }

    @Test
    void deveCancelarFerias() {
        ConfiguracaoEmpresa.getInstance().setUsuarioLogado("Usuario 1");
        IServico servico = ServicoFactory.obterServico("Ferias");
        assertEquals("Férias canceladas por Usuario 1", servico.cancelar());
    }

}
