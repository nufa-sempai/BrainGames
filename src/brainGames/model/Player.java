package brainGames.model;

import brainGames.view.Game;

public class Player {

    public static String playerName;

    public static void getPlayerName() {
        System.out.println("\nMay I have your name? ");
        playerName = Game.scanner.nextLine();
        System.out.println("Hello, " + playerName +"\n");
    }

}
