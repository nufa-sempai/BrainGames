package brainGames.controller;

import brainGames.model.Choice;
import brainGames.model.Player;
import brainGames.model.Game;
import brainGames.view.ShowMenu;

public class MenuController{

    public void showMenuWithResult() {

        Game game = new Game();

        ShowMenu showMenu = new ShowMenu();
        Player player = new Player();

        game.printGameName();
        player.setPlayerName();
        player.printPlayerName();

        String userInput;
        Choice choice;

        do {
            showMenu.showMenu();
            userInput = game.scanner.nextLine();
            choice = Choice.getValue(userInput);
            switch (choice) {
                case EVEN:
                    game.createGames(Choice.EVEN);
                    break;
                case CALC:
                    game.createGames(Choice.CALC);
                    break;
                case GCD:
                    game.createGames(Choice.GCD);
                    break;
                case PROGRESSION:
                    game.createGames(Choice.PROGRESSION);
                    break;
                case EXIT:
                    break;
            }
        } while (choice != Choice.EXIT);
    }
}