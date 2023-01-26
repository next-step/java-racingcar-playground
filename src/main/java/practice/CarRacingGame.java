package practice;

import java.text.DecimalFormat;
import java.util.*;

public class CarRacingGame {
    public static String[] getCarnameArray(String names){
        return names.split(",");
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(9);
    }

    public static boolean ableToAdvance(int random){
        return random>3;
    }

    public static List<String> judgeTheWinner(Cars cars){
        List<String> winners= new ArrayList<>();
        Map<Integer,List<String>> carMap= new HashMap<>();
        int max=0;
        for(Car car:cars.getCars()){
            carMap.computeIfAbsent(car.getProgress(),k->new ArrayList<>()).add(car.getName());
            max=Math.max(max,car.getProgress());
        }
        return carMap.get(max);
    }
}
