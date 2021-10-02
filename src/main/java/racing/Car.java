package racing;

import javax.xml.stream.Location;

public class Car {
    private  LocationCar location;
    private final CarName name;

    public Car(String name) {
        Validation.CheckName(name);
        this.name = new CarName(name);
        this.location = new LocationCar(0);
    }

    public String getName() {
        return name.toString();
    }

    public int getLocation() {
        return location.distance();
    }

    public void move(int v) {
        location = location.move(v);
    }

    @Override
    public String toString() {
        return  name + ": " + location +'\n';
    }
}
