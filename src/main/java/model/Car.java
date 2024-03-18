package model;

public class Car {
    private String name;
    private int location;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없다.");
        }
        this.name = name;
        this.location = 0;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void move() {
        location++;
    }

    @Override
    public String toString() {
        return String.format("%s : %s", name, "-".repeat(location));
    }

    public void play(int value) {
        if (value >= 4) location++;
    }
}
