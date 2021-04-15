package brainGames.model;

import brainGames.view.Game;

public class Player {

    private String playerName;

    public String getPlayerName () {
        return playerName;
    }

    public void setPlayerName() {
        System.out.println("\nMay I have your name? ");
        this.playerName = Game.scanner.nextLine();
    }

    public void printPlayerName() {
        System.out.println("Hello, " + playerName +"\n");
    }
}