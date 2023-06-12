import java.util.Random;

public class BoardGame {
    private int playerChoice;
    private int computerChoice;
    private int move;

    public BoardGame(int playerChoice) {
        this.playerChoice = playerChoice;
        this.computerChoice = new Random().nextInt(10) + 1;
        this.move = (computerChoice - playerChoice + 1) * playerChoice;
    }

    public int getPlayerChoice() {
        return playerChoice;
    }

    public int getComputerChoice() {
        return computerChoice;
    }

    public int getMove() {
        return move;
    }
}
