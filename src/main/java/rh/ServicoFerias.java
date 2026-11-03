package rh;

public class ServicoFerias implements IServico {

    public String executar() {
        return "Férias efetivadas por " + ConfiguracaoEmpresa.getInstance().getUsuarioLogado();
    }

    public String cancelar() {
        return "Férias canceladas por " + ConfiguracaoEmpresa.getInstance().getUsuarioLogado();
    }
}
