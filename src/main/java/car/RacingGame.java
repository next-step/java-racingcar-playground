package car;

import java.util.*;
import java.util.stream.Collectors;

public class RacingGame {
    private final int playCount;
    private List<Car> carList = new ArrayList<>();

    public RacingGame(int playCount) {
        if( playCount < 1 ){
            throw new IllegalArgumentException("1회이상 작동해야합니다");
        }
        this.playCount = playCount;
    }

    public void join(Car oh) {
        if( containCar(oh.getName()) ){
            return;
        }
        carList.add(oh);
    }

    public boolean containCar(String carName) {
        return carList.stream()
                .map(car -> car.getName())
                .anyMatch(name -> name.equals(carName));
    }

    public List<Car> findWinners() {
        Comparator<Car> comparatorByDistance = Comparator.comparingInt(Car::getDistance);
        int maxDistance = carList.stream()
                .max(comparatorByDistance)
                .orElseThrow(NoSuchElementException::new).getDistance();

        return carList.stream()
                .filter(car -> car.getDistance() == maxDistance)
                .collect(Collectors.toList());
    }

    public void play() {

        for (int i = 0; i < playCount; i++) {
            goAllCar();
        }
    }

    private void goAllCar(){
        Random random = new Random();
        for (Car car : carList) {
            car.go(random.nextInt(10));
            System.out.println(car.moveView());
        }
        System.out.println();
    }
}
