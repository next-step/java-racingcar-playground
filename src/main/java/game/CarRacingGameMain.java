package game;

import game.domain.Car;
import game.domain.CarRacingGame;
import game.domain.Cars;
import game.views.InputView;
import game.views.OutputView;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Scanner;

public class CarRacingGameMain {

    public static void main(String[] args) {
        CarRacingGame carRacingGame = new CarRacingGame();
        carRacingGame.inputData();
        carRacingGame.gameResult();
        carRacingGame.findWinners();
    }
}