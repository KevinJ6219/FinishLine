public class Player {
    int position;

    public Player() {
        position = 1;
    }

    public int getPosition() {
        return position;
    }

    public void playerRoll() {
        int roll1 = Dice.roll();
        int roll2 = Dice.roll();
        int nextPosition = position + 1;

        if (roll1 + roll2 == nextPosition || roll1 == nextPosition || roll2 == nextPosition) {
            position++;
        }
        System.out.println("You rolled a " + roll1 + " and " + roll2);

    }
}
