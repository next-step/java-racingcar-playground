package carracing.domain;

public class Car {

    public static final int INIT_POSITION = 1;
    private final Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public String getName() {
        return name.getName();
    }
}
