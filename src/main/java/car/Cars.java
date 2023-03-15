package car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        Random random = new Random();
        for(Car car : carList){
            car.go(random.nextInt(10));
        }
    }
}
