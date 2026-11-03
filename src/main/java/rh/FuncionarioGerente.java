package rh;

public class FuncionarioGerente extends Funcionario {

    public String verificarPromocao() {
        if (this.calcularMediaAvaliacoes() >= 7.0f) {
            return "Promovido";
        }
        else {
            return "Não promovido";
        }
    }

    @Override
    public String getTipo() {
        return "Gerente";
    }
}
