package game.views;

import game.domain.Car;
import game.domain.Cars;

import java.util.List;
import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);


    public static List<Car> inputCars(String names) {
        String[] carNames = names.split(",");
        return Cars.carsInit(carNames);
    }

    public static int inputRepetition() {
        return scanner.nextInt();
    }
}
