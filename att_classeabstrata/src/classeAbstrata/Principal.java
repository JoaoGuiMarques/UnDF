package classeAbstrata;

public class Principal {

    public static void main(String[] args) {

        System.out.println("SIMULAÇÃO DE JOGOS");

        //jogo de cartas
        Jogo poker = new JogoCartas("Poker", 4, "Padrão");
        poker.exibirRegras();
        System.out.println();
        poker.iniciar();

        System.out.println("\n-----------------------------\n");

        //teste de validação
        Jogo invalido = new JogoCartas("Poker", 8, "Padrão");
        invalido.iniciar();

        System.out.println("\n-----------------------------\n");

        //jogo de tabuleiro
        Jogo banco = new JogoTabuleiro("Banco Imobiliário", 3, "Quadrado");
        banco.exibirRegras();
        System.out.println();
        banco.iniciar();
    }
}
