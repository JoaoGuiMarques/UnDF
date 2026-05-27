package ex01;

public class ContaBancaria {
    //atributos
    protected String cliente;
    protected int conta;
    protected double saldo;

    //construtor
    public ContaBancaria(String cliente, int conta, double saldo) {
        this.cliente = cliente;
        this.conta = conta;
        this.saldo = saldo;
    }

    //getters e setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos
    //sacar
    public void sacar(double valorSaque) {
        if(saldo < valorSaque) {
            System.out.println("Saldo insuficiente para realização do saque");
        }
        else {
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso no valor de R$" +valorSaque);
        }
    }

    //depositar
    public void depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
        System.out.println("Depósito realizado com sucesso no valor de R$" +valorDeposito);
    }

    @Override public String toString() {
        return "Cliente: " + cliente  + " | Conta: " + conta + " | Saldo: " + saldo;
    }


}
