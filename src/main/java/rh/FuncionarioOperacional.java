package rh;

public class FuncionarioOperacional extends Funcionario {

    public String verificarPromocao() {
        if (this.calcularMediaAvaliacoes() >= 6.0f) {
            return "Promovido";
        }
        else {
            return "Não promovido";
        }
    }

}
