package game.utils;

public class RandomNum {

    public static int RandomMove() {
        return  (int)(Math.random() * 10000 % 9);
    }
}
