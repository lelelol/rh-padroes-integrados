package rh;

public class ServicoDesligamento implements IServico {

    public String executar() {
        return "Desligamento efetivado por " + ConfiguracaoEmpresa.getInstance().getUsuarioLogado();
    }

    public String cancelar() {
        return "Desligamento cancelado por " + ConfiguracaoEmpresa.getInstance().getUsuarioLogado();
    }
}
