package rh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioOperacionalTest {

    @Test
    void deveRetonarPromovido() {
        FuncionarioOperacional funcionario = new FuncionarioOperacional();
        funcionario.setAvaliacao1(6.0f);
        funcionario.setAvaliacao2(6.0f);
        assertEquals("Promovido", funcionario.verificarPromocao());
    }

    @Test
    void deveRetonarNaoPromovido() {
        FuncionarioOperacional funcionario = new FuncionarioOperacional();
        funcionario.setAvaliacao1(6.0f);
        funcionario.setAvaliacao2(5.9f);
        assertEquals("Não promovido", funcionario.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioOperacional funcionario = new FuncionarioOperacional();
        funcionario.setAvaliacao1(6.0f);
        funcionario.setAvaliacao2(5.9f);
        funcionario.setNome("Marcelo");
        funcionario.setMatricula(2);
        assertEquals("Funcionario{matricula=2, nome='Marcelo', resultado=Não promovido}", funcionario.getInfo());
    }
}
