import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame extends Game {

    private int numberToGuess;
    private int maxNumber;
    private boolean gameEnded = false;
    private int winnerPlayer = -1;

    public GuessTheNumberGame(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public void initializeGame(int numberOfPlayers) {
        Random random = new Random();
        this.numberToGuess = random.nextInt(maxNumber) + 1;
        System.out.println("Guess the number between 1 and " + maxNumber);
    }

    @Override
    public boolean endOfGame() {
        return gameEnded;
    }

    @Override
    public void playSingleTurn(int player) {
        System.out.println("Player " + (player + 1) + "'s turn. Enter your guess: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        if (guess == numberToGuess) {
            System.out.println("Player " + (player + 1) + " guessed correctly!");
            gameEnded = true;
            winnerPlayer = player + 1;
        } else if (guess < numberToGuess) {
            System.out.println("Higher!");
        } else {
            System.out.println("Lower!");
        }
    }

    @Override
    public void displayWinner() {
        if (winnerPlayer != -1) {
            System.out.println("Player " + winnerPlayer + " wins!");
        } else {
            System.out.println("No winner.");
        }
    }
}
