package ex3;

public class Funcionario {

    //atributos
    private int idFuncionario;
    private String nomeFuncionario;
    private double salarioFuncionario;

    // getter do id
    public int getIdFuncionario() {
        return idFuncionario;
    }

    // setter do id
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    //getter do nome
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    // setter do nome
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    //getter do salário
    public String getSalarioFuncionario() {
        return "R$ " + salarioFuncionario;
    }
}
