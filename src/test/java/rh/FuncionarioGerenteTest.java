package rh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioGerenteTest {

    @Test
    void deveRetonarPromovido() {
        FuncionarioGerente funcionario = new FuncionarioGerente();
        funcionario.setAvaliacao1(7.0f);
        funcionario.setAvaliacao2(7.0f);
        assertEquals("Promovido", funcionario.verificarPromocao());
    }

    @Test
    void deveRetonarNaoPromovido() {
        FuncionarioGerente funcionario = new FuncionarioGerente();
        funcionario.setAvaliacao1(7.0f);
        funcionario.setAvaliacao2(6.9f);
        assertEquals("Não promovido", funcionario.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioGerente funcionario = new FuncionarioGerente();
        funcionario.setAvaliacao1(7.0f);
        funcionario.setAvaliacao2(7.0f);
        funcionario.setNome("Marco");
        funcionario.setMatricula(1);
        assertEquals("Gerente{matricula=1, nome='Marco', resultado=Promovido}", funcionario.getInfo());
    }
}
