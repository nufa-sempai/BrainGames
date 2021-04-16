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
                    game.createGames(Choice.EVEN).startGame();
                    break;
                case CALC:
                    game.createGames(Choice.CALC).startGame();
                    break;
                case GCD:
                    game.createGames(Choice.GCD).startGame();
                    break;
                case PROGRESSION:
                    game.createGames(Choice.PROGRESSION).startGame();
                    break;
                case EXIT:
                    break;
            }
        } while (choice != Choice.EXIT);
    }
}