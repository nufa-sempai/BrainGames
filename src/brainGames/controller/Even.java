package brainGames.controller;

import brainGames.model.Choice;
import brainGames.model.IGamesFactory;
import brainGames.model.Player;
import brainGames.model.Randomizer;
import brainGames.view.Game;

public class Even implements IGamesFactory {

    public void brainGames () {

        Game game = new Game();
        Randomizer rand = new Randomizer();
        game.printGameName();
        System.out.println("Answer \"yes\" if number even otherwise \"no\".");
        Player player = new Player();
        player.setPlayerName();
        player.printPlayerName();

        String userInput;
        int point = 0;

        do {
            int number = rand.randomNumber(100);
            System.out.println("Question: " + number);
            userInput = game.scanner.nextLine();
            if (number % 2 == 0 && userInput.equals(Choice.YES.value)) {
                System.out.println("Correct!!");
                point++;
            } else if (number % 2 != 0 && userInput.equals(Choice.NO.value)) {
                System.out.println("Correct!!");
                point++;
            } else {
                System.out.println("Lets try again, " + player.getPlayerName());
                point = 5; }
            if (point == 3) {
                System.out.println("Congratulations, " + player.getPlayerName() + "!");
            }
        } while (point < 3);
    }

//    public static void main(String[] args) {
//        Even.gameEven();
//    }
}
