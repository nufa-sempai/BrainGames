package brainGames.controller;

import brainGames.model.Choice;
import brainGames.model.Player;
import brainGames.view.Game;
import brainGames.view.ShowMenu;

public class MenuController{

    public static void showMenuWithResult() {

        Game.printGameName();
        Player player = new Player();
        player.setPlayerName();
        player.printPlayerName();

        String userInput;
        Choice choice;

        do {
            ShowMenu.showMenu();
            userInput = Game.scanner.nextLine();
            choice = Choice.getValue(userInput);
            switch (choice) {
                case EVEN:
                    Even.gameEven();
                    break;
                case CALC:
                    Calc.gameCalc();
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
