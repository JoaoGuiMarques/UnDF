package Estoque;

public class Produto {
    //atributos
    String nome;
    double preco;
    int quantidade;

    //métodos
    //calcular valor
    public double calcularValor() {
        return preco * quantidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " +nome);
        System.out.println("Preço: " +preco);
        System.out.println("Quantidade: " +quantidade);
        System.out.println("Valor: " +calcularValor());
    }

    //adicionar no estoque
    public void entradaEstoque(int quantidadeAdicionada) {
        quantidade += quantidadeAdicionada;
    }

    //retirar do estoque + validação
    public void saidaEstoque(int quantidadeRetirada) {
        if (quantidadeRetirada > quantidade) {
            System.out.println("Erro: quantidade insuficiente no estoque");
        }
        else {
            quantidade -= quantidadeRetirada;
        }
    }

}
