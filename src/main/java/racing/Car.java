package racing;

public class Car {
    private final String name;
    private final int location;

    public Car(String name) {
        Validation.CheckName(name);
        this.name =name;
        this.location = 0;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }
}
