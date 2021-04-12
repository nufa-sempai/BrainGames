package brainGames.model;

import java.util.Random;

public class Randomizer {

    public static int randomNumber () {
        Random random = new Random();
        int number = random.nextInt(100);
        return number;
    }
}
