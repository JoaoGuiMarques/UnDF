import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o lado 2: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o lado 3: ");
        double lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 &&
                lado1 + lado3 > lado2 &&
                lado2 + lado3 > lado1) {

            System.out.println("Os valores formam um triângulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Tipo: Triângulo Equilátero");
            }

            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Tipo: Triângulo Isósceles");
            }

            else {
                System.out.println("Tipo: Triângulo Escaleno");
            }

        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }

        sc.close();
    }
}