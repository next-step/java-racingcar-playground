package racingcar;

public class Car {

    private final String name;
    private int position;

    public Car(final String name) {
        this.name = name;
        position = 1;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        position++;
    }
}
