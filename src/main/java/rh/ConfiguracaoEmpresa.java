package rh;

public class ConfiguracaoEmpresa {

    private ConfiguracaoEmpresa() {};
    private static ConfiguracaoEmpresa instance = new ConfiguracaoEmpresa();
    public static ConfiguracaoEmpresa getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String usuarioLogado;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
