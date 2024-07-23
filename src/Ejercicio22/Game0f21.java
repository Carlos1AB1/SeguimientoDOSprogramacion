package Ejercicio22;

import java.util.Random;
import java.util.Scanner;

class GameOf21 {
    private static final int MAX_POINTS = 21;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);


    private static int getCard() {
        return random.nextInt(10) + 1;
    }


    private static int calculateTotal(int[] hand) {
        int total = 0;
        for (int card : hand) {
            total += card;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] playerHand = { getCard(), getCard() };
        int[] computerHand = { getCard(), getCard() };

        boolean playerTurn = true;
        while (playerTurn) {
            int playerTotal = calculateTotal(playerHand);
            System.out.println("Tu puntuación actual: " + playerTotal);
            System.out.println("¿Quieres pedir otra carta? (sí/no): ");
            String decision = scanner.nextLine().trim().toLowerCase();
            if (decision.equals("sí")) {
                int[] newHand = new int[playerHand.length + 1];
                System.arraycopy(playerHand, 0, newHand, 0, playerHand.length);
                newHand[newHand.length - 1] = getCard();
                playerHand = newHand;
                if (calculateTotal(playerHand) > MAX_POINTS) {
                    System.out.println("Te has pasado de 21. ¡Pierdes!");
                    return;
                }
            } else {
                playerTurn = false;
            }
        }

        while (calculateTotal(computerHand) < 17) {
            int[] newHand = new int[computerHand.length + 1];
            System.arraycopy(computerHand, 0, newHand, 0, computerHand.length);
            newHand[newHand.length - 1] = getCard();
            computerHand = newHand;
        }

        int playerTotal = calculateTotal(playerHand);
        int computerTotal = calculateTotal(computerHand);
        System.out.println("Tu puntuación final: " + playerTotal);
        System.out.println("Puntuación final de la computadora: " + computerTotal);

        if (playerTotal > MAX_POINTS) {
            System.out.println("Te has pasado de 21. ¡Pierdes!");
        } else if (computerTotal > MAX_POINTS || playerTotal > computerTotal) {
            System.out.println("¡Ganaste!");
        } else if (playerTotal < computerTotal) {
            System.out.println("¡Perdiste!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }
}

