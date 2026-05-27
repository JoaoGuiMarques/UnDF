package ex01;

public class Contas {
    public static void main(String[] args) {
        //criar objetos
        ContaBancaria contaBancaria = new ContaBancaria("Jonas", 26111, 100);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Lucas", 26222, 400, 15);
        ContaEspecial contaEspecial = new ContaEspecial("Pedro", 26333, 1000, 500);

        //métodos sacar
        contaBancaria.sacar(20);
        contaPoupanca.sacar(100);
        contaEspecial.sacar(1200);

        //métodos depositar
        contaBancaria.depositar(5);
        contaPoupanca.depositar(50);
        contaEspecial.depositar(100);

        //métodos conta poupança
        contaPoupanca.calcularNovoSaldo(100);

        System.out.println(contaBancaria);
        System.out.println(contaPoupanca);
        System.out.println(contaEspecial);
    }
}
