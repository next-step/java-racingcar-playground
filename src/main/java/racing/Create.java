package racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Create {
    public static List<Car> NewCar(String[] car) {
        return Arrays.stream(car).map(a -> new Car(a)).collect(Collectors.toList());
    }
}
