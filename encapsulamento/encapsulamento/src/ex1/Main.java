package ex1;

public class Main {
    public static void main(String[] args) {

        //criando obj pessoa
        Pessoa pessoa = new Pessoa();

        //atribuindo valores
        pessoa.setNome("João");
        pessoa.setIdade(18);
        pessoa.setPais("Brasil");

        //mostrando valores
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("País: " + pessoa.getPais());
    }
}
