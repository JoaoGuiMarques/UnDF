package ex1;

public class Pessoa {
    //atributos privados
    private String nome;
    private int idade;
    private String pais;

    //getter do nome
    public String getNome() {
        return nome;
    }

    //setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //getter da idade
    public int getIdade() {
        return idade;
    }

    //setter da idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //getter do país
    public String getPais() {
        return pais;
    }

    //setter do pais
    public void setPais(String pais) {
        this.pais = pais;
    }

}
