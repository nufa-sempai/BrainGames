package brainGames.model;

import java.util.Random;

public class Randomizer {

    public int randomNumber (int number) {
        Random random = new Random();
        return random.nextInt(number);
    }
}
