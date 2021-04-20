package brainGames.controller;

import brainGames.model.IGames;
import brainGames.model.Player;
import brainGames.model.Randomizer;
import brainGames.model.Game;

public class Calc implements IGames {

    public void startGame() {

        Game game = new Game();
        Player player = new Player();
        Randomizer rand = new Randomizer();

        game.printGameName();
        System.out.println("What is the result of the expression?");
        player.setPlayerName();
        player.printPlayerName();

        String str = "+-*";
        char[] result = str.toCharArray();

        int choice;
        int answer = 0;
        int point = 0;

        do {
            int a = rand.randomNumber(100);
            int b = rand.randomNumber(50);
            choice = rand.randomNumber(3);

            if (result[choice] == '+') {
                answer = a + b;
            } else if (result[choice] == '-') {
                answer = a - b;
            } else if (result[choice] == '*') {
                answer = a * b;
            }
            System.out.println("Question: " + a + " " + result[choice] + " " + b);
            int inputAnswer = game.scanner.nextInt();
            System.out.println("Your answer: " + inputAnswer);
            if (inputAnswer == answer) {
                System.out.println("Correct! The answer was: " + answer);
                point++;
            } else {
                System.out.println(inputAnswer + " is wrong answer ;( . Correct answer was " + answer);
                System.out.println("Lets try again, " + player.getPlayerName());
                point = 5;
            }
        } while (point < 3);
    }

//    public static void main(String[] args) {
//        Calc.gameCalc();
//    }
}
