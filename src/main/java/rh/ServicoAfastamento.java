package rh;

public class ServicoAfastamento {

    public String executar() {
        return "Afastamento efetivado por " + ConfiguracaoEmpresa.getInstance().getUsuarioLogado();
    }

    public String cancelar() {
        return "Afastamento cancelado por " + ConfiguracaoEmpresa.getInstance().getUsuarioLogado();
    }
}
