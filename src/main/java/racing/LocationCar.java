package racing;

public class LocationCar {


    private final int location;

    public LocationCar(int location) {
        this.location = location;
    }

    public int distance() {
        return this.location;
    }

    public LocationCar move(int v) {
        return new LocationCar(this.location + v);
    }
}
