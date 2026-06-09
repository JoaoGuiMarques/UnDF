package classeAbstrata;

import java.util.Random;

public class JogoCartas extends Jogo {

    private String tipoBaralho;
    private static final int MIN_JOGADORES = 2;
    private static final int MAX_JOGADORES = 6;
    private static final int TOTAL_CARTAS = 52;

    //construtor
    public JogoCartas(String nome, int numeroJogadores, String tipoBaralho) {
        super(nome, numeroJogadores);
        this.tipoBaralho = tipoBaralho;
    }

    @Override
    public void iniciar() {
        System.out.println("Jogo de Cartas: " + nome);

        //validação de jogadores
        if (numeroJogadores < MIN_JOGADORES || numeroJogadores > MAX_JOGADORES) {
            System.out.println("Número de jogadores inválido! "
                    + "Mínimo: " + MIN_JOGADORES
                    + " | Máximo: " + MAX_JOGADORES);
            return;
        }

        //calculo de cartas por jogador e restantes
        int cartasPorJogador = TOTAL_CARTAS / numeroJogadores;
        int cartasRestantes = TOTAL_CARTAS % numeroJogadores;

        //vetor de jogadores
        String[] jogadores = new String[numeroJogadores];
        for (int i = 0; i < numeroJogadores; i++) {
            jogadores[i] = "Jogador " + (i + 1);
        }

        //exibir distribuiçao
        System.out.println("Distribuindo cartas para " + numeroJogadores + " jogadores...");
        for (String jogador : jogadores) {
            System.out.println("  " + jogador + " recebeu " + cartasPorJogador + " cartas.");
        }

        //sortear vencedor da rodada
        Random random = new Random();
        String vencedor = jogadores[random.nextInt(numeroJogadores)];
        System.out.println("Vencedor da rodada: " + vencedor + "!");

        //exibir cartas restantes
        System.out.println("Cartas restantes no baralho: " + cartasRestantes);
    }

    @Override
    public void exibirRegras() {
        System.out.println("Regras do " + nome);
        System.out.println("Cada jogador joga uma carta por vez.");
        System.out.println("Baralho utilizado: " + tipoBaralho);
        System.out.println("Mínimo de jogadores: " + MIN_JOGADORES);
        System.out.println("Máximo de jogadores: " + MAX_JOGADORES);
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo baralho: " + tipoBaralho;
    }
}
