package ex01;

public class ContaPoupanca extends ContaBancaria {

    //atributos
    private int diaRendimento;

    //construtor
    public ContaPoupanca(String cliente, int conta, double saldo, int diaRendimento) {
        super(cliente, conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    //getters e setters
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    //métodos
    public void calcularNovoSaldo(int rendimento) {
         saldo = (saldo * (rendimento/100.0)) + saldo;
         System.out.println("Novo saldo R$" +saldo);
    }

    @Override public String toString() {
        return super.toString() + " | Dia do Rendimento: " + diaRendimento;
    }
}
