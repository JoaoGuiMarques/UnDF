package ex03;

public class ProdutoNacional extends Produto {
    //atributo
    private double taxa;

    //construtor
    public ProdutoNacional(String descricao, double valor, double imposto, double taxa) {
        super(descricao, valor, imposto);
        this.taxa = taxa;
    }

    //sobrescreve calcularValorFinal
    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal() + (valor * (taxa/100));
    }

    @Override
    public void exibir() {
        System.out.println("Descrição: " + descricao + " | Valor final: R$" + calcularValorFinal());
    }
}