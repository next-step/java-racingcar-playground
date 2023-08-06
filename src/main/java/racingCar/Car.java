package racingCar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        if (getRandom() >= 4)
            this.position++;
    }

    public static void validate(String value) {
        if (value.length() > 5) {
            throw new RuntimeException();
        }
    }

    private int getRandom() {
        return (int) (Math.random() * 10 - 1);
    }

    public int getPosition() {
        return position;
    }
}
