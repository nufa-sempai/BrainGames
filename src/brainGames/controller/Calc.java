package brainGames.controller;

import brainGames.model.Player;
import brainGames.model.Randomizer;
import brainGames.view.Game;
import java.util.Random;

public class Calc {

    public static void gameCalc () {

        Game.printGameName();
        System.out.println("What is the result of the expression?");
        Player player = new Player();
        player.setPlayerName();
        player.printPlayerName();

        String str = "+-*";
        char[] result = str.toCharArray();

        Random rand = new Random();
        int choice;
        int answer = 0;
        int point = 0;

        do {
            int a = Randomizer.randomNumber();
            int b = Randomizer.randomNumber();
            choice = rand.nextInt(3);

            if (result[choice] == '+') {
                answer = a + b;
            } else if (result[choice] == '-') {
                answer = a - b;
            } else if (result[choice] == '*') {
                answer = a * b;
            }
            System.out.println("Question: " + a + " " + result[choice] + " " + b);
            int inputAnswer = Game.scanner.nextInt();
            System.out.println("Your answer: " + inputAnswer);
            if (inputAnswer == answer) {
                System.out.println("Correct! The answer was: " + answer);
                point++;
            } else {
                System.out.println(inputAnswer + " is wrong answer ;( . Correct answer was " + answer);
                System.out.println("Lets try again, " + player.getPlayerName());
            }
        } while (point != 3);
    }

//    public static void main(String[] args) {
//        Calc.gameCalc();
//    }
}
