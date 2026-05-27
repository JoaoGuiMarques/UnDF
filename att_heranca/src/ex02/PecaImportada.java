package ex02;

public class PecaImportada extends Peca {
    //atributos
    private float taxaImportacao;
    private float taxaFrete;

    //construtor vazio
    public PecaImportada() {}

    //construtor
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    //sobrescreve calcularPreco
    @Override
    public float calcularPreco() {
        return super.calcularPreco() + taxaImportacao + taxaFrete;
    }

    //sobrescreve exibir
    @Override
    public void exibir() {
        System.out.println("Nome: " + nome + " | Preço com taxas: R$" + calcularPreco());
    }
}