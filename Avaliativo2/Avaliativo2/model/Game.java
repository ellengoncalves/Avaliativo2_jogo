package java.Avaliativo2.model;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do jogador humano: ");
        String nomeHumano = scanner.nextLine();

        Jogador jogadorHumano = new Jogador(nomeHumano);
        Jogador jogadorComputador = new Jogador("Computador");

        int vitoriasJogadorHumano = 0;
        int vitoriasComputador = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Rodada " + (i + 1));
            System.out.print(nomeHumano + ", escolha (Papel, Pedra ou Tesoura): ");
            String escolhaHumano = scanner.nextLine().toLowerCase();

            Coisa escolhaJogadorHumano = criarEscolha(escolhaHumano);
            Coisa escolhaJogadorComputador = escolhaAleatoria();

            System.out.println(nomeHumano + " escolheu: " + escolhaJogadorHumano);
            System.out.println("Computador escolheu: " + escolhaJogadorComputador);

            int resultado = escolhaJogadorHumano.comparar(escolhaJogadorComputador);

            if (resultado > 0) {
                vitoriasJogadorHumano++;
                System.out.println(nomeHumano + " vence a rodada!");
            } else if (resultado < 0) {
                vitoriasComputador++;
                System.out.println("Computador vence a rodada!");
            } else {
                System.out.println("Empate na rodada!");
            }
        }

        if (vitoriasJogadorHumano > vitoriasComputador) {
            System.out.println(nomeHumano + " vence o jogo!");
        } else if (vitoriasJogadorHumano < vitoriasComputador) {
            System.out.println("Computador vence o jogo!");
        } else {
            System.out.println("O jogo termina em empate!");
        }
    }

    private static Coisa criarEscolha(String escolha) {
        if (escolha.equals("papel")) {
            return new Papel();
        } else if (escolha.equals("pedra")) {
            return new Pedra();
        } else if (escolha.equals("tesoura")) {
            return new Tesoura();
        } else {
            throw new IllegalArgumentException("Escolha inválida. Escolha entre Papel, Pedra ou Tesoura.");
        }
    }

    private static Coisa escolhaAleatoria() {
        Random random = new Random();
        int escolha = random.nextInt(3);

        switch (escolha) {
            case 0:
                return new Papel();
            case 1:
                return new Pedra();
            case 2:
                return new Tesoura();
            default:
                return new Papel();
        }
    }
}

