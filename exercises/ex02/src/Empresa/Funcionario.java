package Empresa;

public class Funcionario {
    //atributos
    String nome;
    double salario;

    //métodos para calcular o aumento
    public double calcularAumento() {
        if (salario >= 1 && salario <= 1000) {
            return salario * 0.15;
        }

        else if (salario <= 1500) {
            return salario * 0.10;
        }

        else if (salario <= 2000) {
            return salario * 0.05;
        }

        else {
            return 0;
        }
    }

    //métodos para calcular novo salário
    public double salarioAtual() {
        return salario + calcularAumento();
    }

    //métodos para exibir dados
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário antigo: " + salario);
        System.out.println("Aumento: " + calcularAumento());
        System.out.println("Salário atual: " + salarioAtual());
    }

}
