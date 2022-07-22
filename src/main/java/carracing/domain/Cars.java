package carracing.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars createCars(String[] names){
        List<Car> cars = new ArrayList<>();
        for(String name:names){
            cars.add(new Car(name));
        }
        return new Cars(cars);
    }

}
