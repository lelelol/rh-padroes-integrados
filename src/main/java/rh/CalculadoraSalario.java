package rh;

public class CalculadoraSalario {

    private float valor1;
    private float valor2;

    public CalculadoraSalario(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(RegraSalarial regra) {
        return regra.calcular(valor1, valor2);
    }
}
