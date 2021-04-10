package brainGames.view;

public class Player {

    private static String playerName;

    public static void getPlayerName() {
        System.out.println("\nMay I have your name? ");
        playerName = Game.scanner.nextLine();
        System.out.println("Hello, " + playerName);
    }
}
