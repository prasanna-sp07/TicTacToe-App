import java.util.Random;

public class TicTacToeBoard {
    public static void main(String[] args) {

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol, player2Symbol;
        String currentPlayer;
        char currentSymbol;

        // Random toss (0 or 1)
        Random rand = new Random();
        int toss = rand.nextInt(2);

        // Assign symbols and starting player
        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
            currentSymbol = 'X';
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2;
            currentSymbol = 'X';
        }

        // Display result
        System.out.println("Toss completed!");
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println(currentPlayer + " starts first with " + currentSymbol);
    }
}