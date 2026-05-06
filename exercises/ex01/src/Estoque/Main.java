package Estoque;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       //criar o objeto produto
        Produto produto = new Produto();

        //ler os dados
        System.out.println("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.println("Digite o preço: ");
        produto.preco = scanner.nextDouble();

        System.out.println("Digite a quantidade: ");
        produto.quantidade = scanner.nextInt();

        System.out.println("\nDados do produto: ");
        produto.exibirDados();

        //entrada no estoque
        System.out.println("\nDigite a quantidade que deseja adicionar: ");
        int quantidadeAdicionar = scanner.nextInt();
        produto.entradaEstoque(quantidadeAdicionar);

        System.out.println("\nDados do produto: ");
        produto.exibirDados();

        //saída estoque
        System.out.println("\nDigite a quantidade que deseja retirar: ");
        int quantidadeRetirar = scanner.nextInt();
        produto.saidaEstoque(quantidadeRetirar);

        System.out.println("\nDados do produto: ");
        produto.exibirDados();

        scanner.close();
    }
}
