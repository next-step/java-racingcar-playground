package car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList = new ArrayList<>();
    public Cars(String names) {
        for(String name : names.split(",")){
            carList.add(new Car(name));
        }
    }

    public void play(int count){
        for (int i = 0; i < count; i++) {
            move();
        }
    }

    public void move(){
        for(Car car : carList){
            car.go(5);
            car.printCarMove();
        }
        System.out.println();
    }

    public Car findWinner() {
        Car winner = null;
        for (int i = 0; i < carList.size() - 1; i++) {
            Car car = carList.get(i);
            Car targetCar = carList.get(i+1);
            winner = car.compareDistance(targetCar);
        }

        return winner;
    }


}
