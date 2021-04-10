package brainGames.controller;

import brainGames.model.Choice;
import brainGames.view.Game;
import brainGames.view.Player;
import brainGames.view.ShowMenu;

import java.util.Scanner;

public class MenuController {

    public static void showMenuWithResult() {

        Game.getGameName();
        Player.getPlayerName();
        ShowMenu.showMenu();

        Scanner input = new Scanner(System.in);
        String userInput;
        Choice choice;

        do {
            userInput = input.next();
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
