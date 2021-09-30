package racing;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCar() {
        return carList;
    }

    public void move(List<Car> carList) {
        carList.stream().forEach(car -> car.move((int) Math.round(Math.random())));
    }

    public int Maxdistance() {
        return carList.stream().mapToInt(car -> car.getLocation()).max().getAsInt();
    }


    public List<String> WinName(int distance) {
        return carList.stream().
                filter(car -> car.getLocation() == distance).
                map(name -> name.getName()).
                collect(Collectors.toList());
    }
}
