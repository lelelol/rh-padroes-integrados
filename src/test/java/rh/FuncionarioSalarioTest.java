package rh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioSalarioTest {

    @Test
    void deveAdicionarBonusSalario() {
        Funcionario funcionario = new FuncionarioOperacional();
        funcionario.adicionarBonus(80.0f, 20.0f);
        assertEquals(100.0f, funcionario.getSalario());
    }

    @Test
    void deveAplicarDescontoSalario() {
        Funcionario funcionario = new FuncionarioOperacional();
        funcionario.aplicarDesconto(80.0f, 10.0f);
        assertEquals(70.0f, funcionario.getSalario());
    }

    @Test
    void deveAplicarReajusteSalario() {
        Funcionario funcionario = new FuncionarioOperacional();
        funcionario.aplicarReajuste(80.0f, 1.1f);
        assertEquals(88.0f, funcionario.getSalario());
    }

    @Test
    void deveParcelarSalario() {
        Funcionario funcionario = new FuncionarioOperacional();
        funcionario.parcelarSalario(100.0f, 2.0f);
        assertEquals(50.0f, funcionario.getSalario());
    }

    @Test
    void naoDeveParcelarSalarioEmZeroParcelas() {
        try {
            Funcionario funcionario = new FuncionarioOperacional();
            funcionario.parcelarSalario(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaSalarios() {
        Funcionario funcionario = new FuncionarioOperacional();
        funcionario.calcularMediaSalarios(70.0f, 80.0f);
        assertEquals(75.0f, funcionario.getSalario());
    }

}
