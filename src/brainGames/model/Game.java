package brainGames.model;

import brainGames.controller.Calc;
import brainGames.controller.Even;
import brainGames.controller.GCD;
import brainGames.controller.Progression;

import java.util.Scanner;

public class Game {

    public Scanner scanner = new Scanner(System.in);

    public void printGameName() {
        System.out.println("Welcome to the Brain Games!");
    }

    public IGames createGames(Choice choice) {
        IGames game = null;
        switch (choice) {
            case EVEN:
                game = new Even();
                break;
            case CALC:
                game = new Calc();
                break;
            case GCD:
                game = new GCD();
                break;
            case PROGRESSION:
                game = new Progression();
                break;
        }
        return game;
    }
}
