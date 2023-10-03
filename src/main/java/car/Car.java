package car;

import java.util.Random;

public class Car {
    private static final int MINIMUM_MOVING_STANDARD = 4;
    private final String name;
    private int location = 1;
    public Car(String name) {
        if (name.length() > 5) throw new RuntimeException();
        this.name = name;
    }

    public int getLocation(){
        return this.location;
    }

    public void move(){
        if (MINIMUM_MOVING_STANDARD <= getRandomNum()) this.location++;
    }

    protected int getRandomNum(){
        Random random = new Random();
        return random.nextInt(10);
    }

    public String getName() {
        return name;
    }
}
