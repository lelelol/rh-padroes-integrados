package rh;

public class ServicoAdmissao implements IServico {

    public String executar() {
        return "Admissão efetivada por " + ConfiguracaoEmpresa.getInstance().getUsuarioLogado();
    }

    public String cancelar() {
        return "Admissão cancelada por " + ConfiguracaoEmpresa.getInstance().getUsuarioLogado();
    }
}
