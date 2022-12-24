import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Result {
    public static List<Car> endGame(List<Car> cars) {
        cars.sort(Comparator.comparing(Car::getPosition).reversed());
        List<Car> carList = new ArrayList<>();
        carList.add(cars.get(0));
        for(int i=1;i< cars.size();i++){
            if(cars.get(i-1).getPosition() != cars.get(i).getPosition()){
                break;
            }
            carList.add(cars.get(i));
        }
        return carList;
    }

    public static void printProgreeBar(List<Car> cars){
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i).getName() + " : " + cars.get(i).getPosition());
        }
        System.out.println();
    }

    public static void printResult(List<Car> cars){
        List<Car> result = endGame(cars);
        System.out.print("우승자는 ");
        result.stream().forEach(x-> System.out.print(x.getName() + " "));
    }
}
