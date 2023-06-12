public class MainBoardGame {
    public static void main(String[] args) {
        BoardGame cautiousPlayer = new BoardGame(1);
        System.out.println("Cautious player's choice: " + cautiousPlayer.getPlayerChoice());
        System.out.println("Computer's choice: " + cautiousPlayer.getComputerChoice());
        System.out.println("Cautious player's move: " + cautiousPlayer.getMove());
        BoardGame recklessPlayer = new BoardGame(5);
        System.out.println("Reckless player's choice: " + recklessPlayer.getPlayerChoice());
        System.out.println("Computer's choice: " + recklessPlayer.getComputerChoice());
        System.out.println("Reckless player's move: " + recklessPlayer.getMove());
    }
}
