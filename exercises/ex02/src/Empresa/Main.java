package Empresa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //criar objeto
        Funcionario funcionario = new Funcionario();

        //ler dados
        System.out.println("Digite o nome do funcionário: ");
        funcionario.nome = scanner.nextLine();

        System.out.println("Digite o salário: ");
        funcionario.salario = scanner.nextDouble();

        //exibir resultados
        System.out.println("\nDados do funcionário: ");
        funcionario.exibirDados();

        scanner.close();
    }
}
