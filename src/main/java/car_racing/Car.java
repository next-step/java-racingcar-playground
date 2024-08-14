package car_racing;

import java.util.Random;

public class Car {
    private final String name;
    private final int randomNum;
    private int raceScore;

    public Car(String name) {
        this.name = name;
        this.randomNum = makeRandomNum();
        this.raceScore = 0;
    }

    public static String[] splitCarNames(String str) {
        return str.split(",");
    }
    public int makeRandomNum() {
        Random random = new Random();
        return random.nextInt(9)+1; // 1~9
    }
    public void addScore(int randomNum, int raceScore) {
        if(randomNum >= 4) raceScore++;
        this.raceScore = raceScore;
    }
    public int getRandomNum() {
        return this.randomNum;
    }
    public int getRaceScore() {
        return this.raceScore;
    }
    public String getName() {
        return name;
    }

}
