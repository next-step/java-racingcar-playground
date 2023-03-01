package game.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Cars {

    private static List<Car> carList;

    public static List<Car> carsInit(String[] carNames) {
        ArrayList<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return carList = cars;
    }

    public static List<Car> findWinners() {
        int maxDistance = getMaxDistance(carList);
        return carList.stream()
                .filter(car -> equalCarsWithMaxDistance(maxDistance, car))
                .collect(Collectors.toList());
    }

    private static boolean equalCarsWithMaxDistance(int maxDistance, Car car) {
        return car.getCarPosition() == maxDistance;
    }

    private static int getMaxDistance(List<Car> carList) {
        return carList.stream()
                .mapToInt(Car::getCarPosition)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

}
