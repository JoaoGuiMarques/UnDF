import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 16) {
            System.out.println("Classificação: Magreza grave");
        }

        else if (imc < 17) {
            System.out.println("Classificação: Magreza moderada");
        }

        else if (imc < 18.5) {
            System.out.println("Classificação: Magreza leve");
        }

        else if (imc < 25) {
            System.out.println("Classificação: Saudável");
        }

        else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        }

        else if (imc < 35) {
            System.out.println("Classificação: Obesidade Grau I");
        }

        else if (imc < 40) {
            System.out.println("Classificação: Obesidade Grau II (severa)");
        }

        else {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }

        sc.close();
    }
}
