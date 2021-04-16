package brainGames.view;

import brainGames.controller.Calc;
import brainGames.controller.Even;
import brainGames.controller.GCD;
import brainGames.controller.Progression;
import brainGames.model.Choice;
import brainGames.model.IGamesFactory;

import java.util.Scanner;

public class Game {

    public Scanner scanner = new Scanner(System.in);

    public void printGameName() {
        System.out.println("Welcome to the Brain Games!");
    }

    public IGamesFactory gamesFactory (Choice choice) {
        IGamesFactory game = null;
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
