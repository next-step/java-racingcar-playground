package racing;

import javax.xml.stream.Location;

public class Car {
    private final String name;
    private LocationCar location;

    public Car(String name) {
        Validation.CheckName(name);
        this.name =name;
        this.location = new LocationCar(0);
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location.distance();
    }

    public void move(int v) {
        location = location.move(v);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", location=" + getLocation() +
                '}';
    }
}
