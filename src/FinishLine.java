import java.util.*;

public class FinishLine {
    private Player player1;
    private Player player2;

    public FinishLine(){
        player1 = new Player();
        player2 = new Player();
    }

    public void start() {
        System.out.println("You are playing Finish Line!");
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        int roll1 = 0;
        int roll2 = 0;

        while (player1.getPosition() != 10 || player2.getPosition() == 10) {
            System.out.print("Player 1, Roll your Dice (Enter R): ");
            String r = input.nextLine();
            while (!r.toLowerCase().equals("r")) {
                System.out.print("Player 1, Roll your Dice (Enter R): ");
                r = input.nextLine();
            }
            player1.playerRoll();
            System.out.println("Player 1 is in Position " + player1.getPosition());
            System.out.println("Player 2 is in Position " + player2.getPosition() + "\n");
            if (player1.getPosition() == 10) {
                System.out.println("Player 1 Wins");
                break;
            }
            System.out.print("Player 2, Roll your Dice (Enter R): ");
            r = input.nextLine();
            while (!r.toLowerCase().equals("r")) {
                System.out.print("Player 2, Roll your Dice (Enter R): ");
                r = input.nextLine();
            }
            player2.playerRoll();
            System.out.println("Player 1 is in Position " + player1.getPosition());
            System.out.println("Player 2 is in Position " + player2.getPosition() + "\n");

            if (player2.getPosition() == 10) {
                System.out.println("Player 2 Wins");
                break;
            }



        }
    }


}