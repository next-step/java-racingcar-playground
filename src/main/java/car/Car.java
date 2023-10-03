package car;

public class Car {
    private int location; // 초기값은 0 (primitive)
    private final String name;
    public Car(String name) {
        if (name.length() > 5) throw new IllegalArgumentException();
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getLocation() {
        return location;
    }

    public void move() {
        this.location++;
    }

    public void moveByStrategy(int digit, MoveStrategy moveStrategy) {
        if (moveStrategy.move(digit)) this.move();
    }
}
