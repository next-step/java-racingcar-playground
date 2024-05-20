package racingCar;

import java.util.List;

public class CarReport {

    public void print(List<Car> cars) {
        for (Car car : cars){
            System.out.print(car.getCarName().getName() + " : ");
            CarPosition position = car.getCarPosition();
            for (int i = 0; i<position.getPosition(); i++){
                System.out.printf("%s", "-");
            }
            System.out.println();
        }
        System.out.println();
    }

}
