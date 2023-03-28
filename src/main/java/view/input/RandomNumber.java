package view.input;

import java.util.Random;

public class RandomNumber {
    public static int getRandomNumber(){
        Random random = new Random();

        return Math.abs(random.nextInt() % 10);
    }
}
