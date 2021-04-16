package brainGames.controller;

import brainGames.model.Choice;
import brainGames.model.IGamesFactory;
import brainGames.model.Player;
import brainGames.view.Game;
import brainGames.view.ShowMenu;

public class MenuController{

    public void showMenuWithResult() {

        Game game = new Game();
        IGamesFactory evenGame = game.gamesFactory(Choice.EVEN);
        IGamesFactory calcGame = game.gamesFactory(Choice.CALC);
        IGamesFactory gcdGame = game.gamesFactory(Choice.GCD);
        IGamesFactory progressionGame = game.gamesFactory(Choice.PROGRESSION);

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
                    evenGame.brainGames();
                    break;
                case CALC:
                    calcGame.brainGames();
                    break;
                case GCD:
                    gcdGame.brainGames();
                    break;
                case PROGRESSION:
                    progressionGame.brainGames();
                    break;
                case EXIT:
                    break;
            }
        } while (choice != Choice.EXIT);
    }
}