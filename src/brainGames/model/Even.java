package brainGames.model;

import brainGames.view.Game;

public class Even {

    public static void gameEven () {

        Game.getGameName();
        System.out.println("Answer \"yes\" if number even otherwise \"no\"." + "\n");

        String userInput;
        int count = 0;
        Choice choice;

        do {
            int number = Randomizer.randomNumber();
            System.out.println("Question: " + number);
            userInput = Game.scanner.nextLine();
            choice = Choice.getValue(userInput);
            switch (choice) {
                case YES:
                    if (number % 2 == 0 && userInput.equals(Choice.YES.value)) {
                        System.out.println("Correct!!");
                        count++;
                    } else {
                        System.out.println("Lets try again, " + Player.playerName);
                        count = 3; }
                    break;
                case NO:
                    if (number % 2 != 0 && userInput.equals(Choice.NO.value)) {
                        System.out.println("Correct!!");
                        count++;
                    } else {
                        System.out.println("Lets try again, " + Player.playerName);
                        count = 3; }
                    break;
            }
            //Как-то надо чтобы выводило Congratulations, "name"!
        } while (count != 3);
    }

//    public static void main(String[] args) {
//        Even.gameEven();
//    }
}
