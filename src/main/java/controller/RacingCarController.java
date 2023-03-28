package controller;

import model.RacingCar;
import view.input.InputView;
import view.input.RandomNumber;
import view.output.ResultOutput;

import java.util.ArrayList;
import java.util.List;

public class RacingCarController {
    public static void play(){
        List<RacingCar> racingCars = new ArrayList<>();
        String[] names = InputView.inputNames();
        int trial = InputView.inputTrial();

        createRacingCars(racingCars, names);
        List<String> winner = playGame(racingCars, trial);

        printResult(racingCars, winner);
    }

    private static List<String> playGame(List<RacingCar> racingCars, int trial) {
        List<String> winner = new ArrayList<>();

        while(winner.isEmpty()) {
            playTurn(racingCars);
            winner = checkGameFinished(racingCars, trial);
        }
        return winner;
    }

    private static void printResult(List<RacingCar> racingCars, List<String> winner) {
        printTurnResult(racingCars);
        ResultOutput.outputGameResult(winner);
    }

    private static List<String> checkGameFinished(List<RacingCar> racingCars, int trial) {
        List<String> winner = new ArrayList<>();
        for (RacingCar racingCar : racingCars) {
            if(racingCar.getNumOfMove() == trial) winner.add(racingCar.getCarName());
        }
        return winner;
    }

    private static void playTurn(List<RacingCar> racingCars) {
        moveRacingCars(racingCars);
        printTurnResult(racingCars);

    }

    private static void createRacingCars(List<RacingCar> racingCars, String[] strings) {
        for (String string : strings) {
            racingCars.add(new RacingCar(string));
        }
    }

    private static void printTurnResult(List<RacingCar> racingCars) {
        for (RacingCar racingCar : racingCars) {
            ResultOutput.outputTurnResult(racingCar.getCarName(), racingCar.getNumOfMove());
        }
        System.out.println();
    }

    private static void moveRacingCars(List<RacingCar> racingCars) {
        for (RacingCar racingCar : racingCars) {
            racingCar.moveRacingCar(RandomNumber.getRandomNumber());
        }
    }
}
