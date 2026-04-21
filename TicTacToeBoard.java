import java.util.Scanner;

public class TicTacToeBoard {

    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot; 
    }

    public static void main(String[] args) {

        
        int chosenSlot = getUserSlot();

        
        System.out.println("You selected slot: " + chosenSlot);
    }
}