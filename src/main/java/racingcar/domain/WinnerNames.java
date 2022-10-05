package racingcar.domain;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WinnerNames {
    public List<String> findWinners(List<Car> cars) {
        return getWinnerNamesWithFirstCar(findFastestCar(new ArrayList<>(cars)), cars);
    }


    private Car findFastestCar(List<Car> cars) {
        
        for(Car car : cars){
            System.out.println("정렬 전 [차 이름: " + car.getCarName() +"," + "차 위치"+car.getCarPosition()+"]");
        }
        Collections.sort(cars);
        System.out.println("------------------------------------------------------------------------------------");
        for(Car car : cars){
            System.out.println("정렬 후 [차 이름: " + car.getCarName() +"," + "차 위치"+car.getCarPosition()+"]");
        }
        return cars.get(0);
    }

    private List<String> getWinnerNamesWithFirstCar(Car firstCar, List<Car> cars) {
        List<String> winnerNames = new ArrayList<>();
        for (Car car : cars) {
            addWinnerByFastestCar(car, firstCar, winnerNames);
        }
        return winnerNames;
    }

    private void addWinnerByFastestCar(Car car, Car fastest, List<String> winnerNames) {
        if (fastest.compareTo(car) == 0) {
            winnerNames.add(car.getCarName());
        }
    }

}
