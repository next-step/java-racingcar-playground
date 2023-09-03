package study.racingcar;

import java.io.IOException;
import java.util.List;

public class RacingCompetition {

    private RacingCarCreator racingCarCreator;
    private RandomNumberCreator randomNumberCreator;
    private CompetitionPreparer competitionPreparer;
    private GoalLine goalLine;
    private WonRacingCarInformer wonRacingCarInformer;

    public RacingCompetition(RacingCarCreator racingCarCreator,
        RandomNumberCreator randomNumberCreator,
        CompetitionPreparer competitionPreparer, GoalLine goalLine,
        WonRacingCarInformer wonRacingCarInformer) {
        this.racingCarCreator = racingCarCreator;
        this.randomNumberCreator = randomNumberCreator;
        this.competitionPreparer = competitionPreparer;
        this.goalLine = goalLine;
        this.wonRacingCarInformer = wonRacingCarInformer;
    }

    public void processCompetition() throws IOException {

        RacingCarNamesAndTotalCnt racingCarNamesAndTotalCnt = competitionPreparer.getRacingCarNamesAndTotalCnt();

        List<String> racingCarNameList = List.of(racingCarNamesAndTotalCnt.getRacingCarNames().split(","));
        List<RacingCar> racingCars = racingCarCreator.createRacingCars(racingCarNameList);

        for (int i = 0; i < racingCarNamesAndTotalCnt.getTotalCnt(); i++) {
            moveRacingCars(racingCars);
        }

        List<String> wonRacingCarNames = goalLine.informWonRacingCars(racingCars);
        wonRacingCarInformer.informWonRacingCar(wonRacingCarNames);
    }

    private void moveRacingCars(List<RacingCar> racingCars) {
        for (RacingCar racingCar : racingCars) {
            int randomNumber = randomNumberCreator.createZeroToNine();
            racingCar.move(randomNumber);
        }
    }
}
