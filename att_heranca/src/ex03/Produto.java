package ex03;

public class Produto {
    //atributos
    protected String descricao;
    protected double valor;
    protected double imposto;

    //construtor
    public Produto(String descricao, double valor, double imposto) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
    }

    //métodos calcularValorFinal
    public double calcularValorFinal() {
        return valor + (valor * (imposto/100));
    }

    //exibir dados
    public void exibir() {
        System.out.println("Descrição: " + descricao + " | Valor final: R$" + calcularValorFinal());
    }
}