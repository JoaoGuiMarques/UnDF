import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU DO RESTAURANTE ===");
        System.out.println("1 - Pizza");
        System.out.println("2 - Hambúrguer");
        System.out.println("3 - Salada");
        System.out.println("4 - Bebida");

        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Pizza - Molho de tomate, queijo e calabresa");
                System.out.println("Preço: R$ 30.00");
                break;

            case 2:
                System.out.println("Hambúrguer - Pão, carne, queijo e salada");
                System.out.println("Preço: R$ 20.00");
                break;

            case 3:
                System.out.println("Salada - Mix de folhas, tomate e cenoura");
                System.out.println("Preço: R$ 15.00");
                break;

            case 4:
                System.out.println("Bebida - Refrigerante ou suco");
                System.out.println("Preço: R$ 8.00");
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
