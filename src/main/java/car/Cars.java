package car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> carList;
    public Cars(String names) {
        carList = Arrays.stream(names.split(","))
                .map(name -> new Car(name))
                .collect(Collectors.toList());
    }

    public void play(int count){
        for (int i = 0; i < count; i++) {
            move();
        }
    }

    public void move(){
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).go(3);
        }
    }
}
