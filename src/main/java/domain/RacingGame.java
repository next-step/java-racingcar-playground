package domain;

import java.io.IOException;
import java.util.List;

public class RacingGame {

    private final RaceGameInformer raceGameInformer;
    private final RacingCarGenerator racingCarGenerator;
    private final RandomNumberGenerator randomNumberGenerator;
    private final GoalLine goalLine;
    private final WinnerPrinter winnerPrinter;

    public RacingGame(RaceGameInformer raceGameInformer, RacingCarGenerator racingCarGenerator,
        RandomNumberGenerator randomNumberGenerator, GoalLine goalLine,
        WinnerPrinter winnerPrinter) {
        this.raceGameInformer = raceGameInformer;
        this.racingCarGenerator = racingCarGenerator;
        this.randomNumberGenerator = randomNumberGenerator;
        this.goalLine = goalLine;
        this.winnerPrinter = winnerPrinter;
    }

    public void startGame() throws IOException {

        RaceGameInfo raceGameInfo = raceGameInformer.InformRaceGameInfo();

        List<RacingCar> racingCars = racingCarGenerator.create(raceGameInfo.getRacingCarNames());

        for (int i = 0; i < raceGameInfo.getRaceCount(); i++) {
            race(racingCars);
        }

        List<RacingCar> winner = goalLine.informWinner(racingCars);

        winnerPrinter.print(winner);
    }

    private void race(List<RacingCar> racingCars) {
        for (RacingCar racingCar : racingCars) {
            int randomNumber = randomNumberGenerator.create();
            racingCar.move(randomNumber);
        }
    }
}