package brainGames.controller;

import brainGames.model.Choice;
import brainGames.model.Player;
import brainGames.model.Randomizer;
import brainGames.view.Game;

public class Even {

    public static void gameEven () {

        Game.printGameName();
        System.out.println("Answer \"yes\" if number even otherwise \"no\".");
        Player player = new Player();
        player.setPlayerName();
        player.printPlayerName();

        String userInput;
        int count = 0;
        int point = 0;

        do {
            int number = Randomizer.randomNumber();
            System.out.println("Question: " + number);
            userInput = Game.scanner.nextLine();
            if (number % 2 == 0 && userInput.equals(Choice.YES.value)) {
                System.out.println("Correct!!");
                point++;
//                System.out.println(point);
            } else if (number % 2 != 0 && userInput.equals(Choice.NO.value)) {
                System.out.println("Correct!!");
                point++;
//                System.out.println(point);
            } else {
                System.out.println("Lets try again, " + player.getPlayerName());
                count = 3; }
            if (point == 3) {
                System.out.println("Congratulations, " + player.getPlayerName() + "!");
            }
        } while (count < 3 | point < 3);
    }

//    public static void main(String[] args) {
//        Even.gameEven();
//    }
}
