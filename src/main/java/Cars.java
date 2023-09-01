import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] nameArr){
        this.cars = Arrays.stream(nameArr).map(Car::new).collect(Collectors.toList());
    }

    public void move(){
        cars.forEach(Car::move);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> winners() {
        int maxLocation = cars.stream()
                .mapToInt(Car::getLocation)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getLocation() == maxLocation)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
