package racing;

public class CarName {
    private final String carName;

    public CarName(String name) {
        this.carName = name;
    }

    @Override
    public String toString() {
        return carName;
    }
}
