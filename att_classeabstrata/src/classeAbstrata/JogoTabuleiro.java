package classeAbstrata;

import java.util.Random;

public class JogoTabuleiro extends Jogo {

    private String tipoTabuleiro;
    private static final int TAMANHO_TABULEIRO = 30;
    private static final int FACES_DADO = 6;

    public JogoTabuleiro(String nome, int numeroJogadores, String tipoTabuleiro) {
        super(nome, numeroJogadores);
        this.tipoTabuleiro = tipoTabuleiro;
    }

    @Override
    public void iniciar() {
        System.out.println("Jogo de Tabuleiro: " + nome);

        Random random = new Random();

        //criar vetor de jogadores e vetor de posiçoes
        String[] jogadores = new String[numeroJogadores];
        int[] posicoes = new int[numeroJogadores];

        for (int i = 0; i < numeroJogadores; i++) {
            jogadores[i] = "Jogador " + (i + 1);
            posicoes[i] = 0;
        }

        //loop do jogo
        int rodadas = 0;
        int vencedor = -1;

        while (vencedor == -1) {
            rodadas++;
            System.out.println("\n Rodada " + rodadas);

            for (int i = 0; i < numeroJogadores; i++) {
                //sorteia o dado (1 a 6)
                int dado = random.nextInt(FACES_DADO) + 1;
                posicoes[i] += dado;

                System.out.println(jogadores[i]
                        + " tirou " + dado
                        + " -> posição " + posicoes[i]);

                //verifica se chegou ao fim
                if (posicoes[i] >= TAMANHO_TABULEIRO) {
                    vencedor = i;
                    break;
                }
            }
        }

        //exibir resultado final
        System.out.println("\nVencedor: " + jogadores[vencedor]
                + " chegou à casa " + posicoes[vencedor] + "!");
        System.out.println("Total de rodadas: " + rodadas);
    }

    @Override
    public void exibirRegras() {
        System.out.println("Regras do " + nome);
        System.out.println("Cada jogador lança um dado de " + FACES_DADO + " faces.");
        System.out.println("Quem chegar à casa " + TAMANHO_TABULEIRO + " primeiro vence.");
        System.out.println("Tabuleiro: " + tipoTabuleiro);
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo tabuleiro: " + tipoTabuleiro;
    }
}