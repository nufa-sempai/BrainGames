package brainGames.controller;

import brainGames.model.Choice;
import brainGames.view.Game;
import brainGames.view.Player;
import brainGames.view.ShowMenu;

public class MenuController {

    public static void showMenuWithResult() {

        Game.getGameName();
        Player.getPlayerName();
        ShowMenu.showMenu();

        String userInput;
        Choice choice;

        do {
            userInput = Game.scanner.nextLine();
            choice = Choice.getValue(userInput);
            assert choice != null;
            switch (choice) {
                case EVEN:
                    break;
                case CALC:
                    break;
                case GCD:
                    break;
                case PROGRESSION:
                    break;
                case EXIT:
                    break;
            }
        } while (choice != Choice.EXIT);
    }
}
