package rh;

public abstract class Funcionario {

    private int matricula;
    protected String nome;
    private float avaliacao1;
    private float avaliacao2;
    private float salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(float avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    public float getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(float avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }

    // Template Method

    public float calcularMediaAvaliacoes() {
        return (this.avaliacao1 + this.avaliacao2) / 2;
    }

    public abstract String verificarPromocao();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matricula=" + this.matricula +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarPromocao() +
                '}';
    }

    // Strategy

    public float getSalario() {
        return salario;
    }

    public void adicionarBonus(float salario, float bonus) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario, bonus);
        this.salario = calculadora.calcular(new RegraBonus());
    }

    public void aplicarDesconto(float salario, float desconto) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario, desconto);
        this.salario = calculadora.calcular(new RegraDesconto());
    }

    public void parcelarSalario(float salario, float parcelas) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario, parcelas);
        this.salario = calculadora.calcular(new RegraParcelamento());
    }

    public void aplicarReajuste(float salario, float indice) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario, indice);
        this.salario = calculadora.calcular(new RegraReajuste());
    }

    public void calcularMediaSalarios(float salario1, float salario2) {
        CalculadoraSalario calculadora = new CalculadoraSalario(salario1, salario2);
        this.salario = calculadora.calcular(new RegraMedia());
    }
}
