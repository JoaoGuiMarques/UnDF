package ex3;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setIdFuncionario(1);
        funcionario.setNomeFuncionario("João");

        System.out.println("ID: " + funcionario.getIdFuncionario());
        System.out.println("Nome: " + funcionario.getNomeFuncionario());
        System.out.println("Salário: " + funcionario.getSalarioFuncionario());
    }
}
