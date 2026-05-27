package ex02;

public class Peca {
    //atributos
    protected String nome;
    protected float custo;
    protected float lucro;

    //construtor vazio
    public Peca() {}

    //construtor
    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    //métodos
    //calcularPreco:
    public float calcularPreco() {
        return custo + lucro;
    }

    //exibir
    public void exibir() {
        System.out.println("Nome: " + nome + " | Preço: R$" + calcularPreco());
    }
}