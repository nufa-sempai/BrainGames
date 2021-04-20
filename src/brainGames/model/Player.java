package brainGames.model;

public class Player {

    private String playerName;

    public String getPlayerName () {
        return playerName;
    }

    public void setPlayerName() {
        Game game = new Game();
        System.out.println("\nMay I have your name? ");
        this.playerName = game.scanner.nextLine();
    }

    public void printPlayerName() {
        System.out.println("Hello, " + playerName + "\n");
    }
}

