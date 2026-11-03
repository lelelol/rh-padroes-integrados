package rh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAdmissaoTest {

    @Test
    void deveExecutarAdmissao() {
        ConfiguracaoEmpresa.getInstance().setUsuarioLogado("Usuario 1");
        IServico servico = ServicoFactory.obterServico("Admissao");
        assertEquals("Admissão efetivada por Usuario 1", servico.executar());
    }

    @Test
    void deveCancelarAdmissao() {
        ConfiguracaoEmpresa.getInstance().setUsuarioLogado("Usuario 1");
        IServico servico = ServicoFactory.obterServico("Admissao");
        assertEquals("Admissão cancelada por Usuario 1", servico.cancelar());
    }

}
