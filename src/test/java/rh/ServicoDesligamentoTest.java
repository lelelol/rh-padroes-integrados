package rh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDesligamentoTest {

    @Test
    void deveExecutarDesligamento() {
        ConfiguracaoEmpresa.getInstance().setUsuarioLogado("Usuario 1");
        IServico servico = ServicoFactory.obterServico("Desligamento");
        assertEquals("Desligamento efetivado por Usuario 1", servico.executar());
    }

    @Test
    void deveCancelarDesligamento() {
        ConfiguracaoEmpresa.getInstance().setUsuarioLogado("Usuario 1");
        IServico servico = ServicoFactory.obterServico("Desligamento");
        assertEquals("Desligamento cancelado por Usuario 1", servico.cancelar());
    }

}
