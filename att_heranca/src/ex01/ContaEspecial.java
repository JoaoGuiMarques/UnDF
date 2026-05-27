package ex01;

public class ContaEspecial extends ContaBancaria {
    //atributo
    private double limite;

    //construtor
    public ContaEspecial(String cliente, int conta, double saldo, double limite) {
        super(cliente, conta, saldo);
        this.limite = limite;
    }

    //getters e setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valorSaque) {
        if(saldo - valorSaque < -limite) {
            System.out.println("O valor do saque ultrapassou o limite de R$" +limite);
        }
        else {
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso no valor de R$" +valorSaque);
        }
    }

    @Override public String toString() {
        return super.toString() + " | Limite da conta: " + limite;
    }
}
