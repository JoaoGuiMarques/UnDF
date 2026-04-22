import javax.swing.JOptionPane;

public class Exercise01 {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");

        String salarioStr = JOptionPane.showInputDialog("Digite o salário atual:");

        double salario = Double.parseDouble(salarioStr);

        String tempoStr = JOptionPane.showInputDialog("Digite o tempo de serviço (em anos):");

        int tempoServico = Integer.parseInt(tempoStr);

        double bonus;

        if (tempoServico > 5) {
            bonus = salario * 0.05;
        }

        else {
            bonus = salario * 0.013;
        }

        double novoSalario = salario + bonus;

        JOptionPane.showMessageDialog(null,
                "Funcionário: " + nome +
                        "\nSalário antigo: R$ " + salario +
                        "\nBônus: R$ " + bonus +
                        "\nNovo salário: R$ " + novoSalario +
                        "\nTempo de serviço: " + tempoServico + " anos");
    }
}