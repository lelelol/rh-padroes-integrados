package rh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegracaoTest {

    @Test
    void deveAdmitirAvaliarEReajustarGerente() {
        ConfiguracaoEmpresa.getInstance().setNomeEmpresa("Empresa 1");
        ConfiguracaoEmpresa.getInstance().setUsuarioLogado("RH");

        IServico admissao = ServicoFactory.obterServico("Admissao");
        assertEquals("Admissão efetivada por RH", admissao.executar());

        Funcionario funcionario = new FuncionarioGerente();
        funcionario.setNome("Marco");
        funcionario.setMatricula(1);
        funcionario.setAvaliacao1(8.0f);
        funcionario.setAvaliacao2(7.0f);
        assertEquals("Gerente{matricula=1, nome='Marco', resultado=Promovido}", funcionario.getInfo());

        funcionario.aplicarReajuste(80.0f, 1.1f);
        assertEquals(88.0f, funcionario.getSalario());
    }
}
