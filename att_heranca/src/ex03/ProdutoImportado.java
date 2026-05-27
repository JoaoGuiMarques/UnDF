package ex03;

public class ProdutoImportado extends ProdutoNacional {
    //atributo
    private double taxaImportacao;

    //construtor
    public ProdutoImportado(String descricao, double valor, double imposto, double taxa, double taxaImportacao) {
        super(descricao, valor, imposto, taxa);
        this.taxaImportacao = taxaImportacao;
    }

    //sobrescreve calcularValorFinal
    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal() + (valor * (taxaImportacao/100));
    }

    @Override
    public void exibir() {
        System.out.println("Descrição: " + descricao + " | Valor final: R$" + calcularValorFinal());
    }
}