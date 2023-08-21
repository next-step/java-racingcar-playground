package racinggame.domain;

import racinggame.domain.car.Car;
import racinggame.domain.dto.DriveResult;
import racinggame.domain.dto.GameResult;
import racinggame.domain.dto.RaceResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingGameTests {
    private RacingGame racingGame;

    @BeforeEach
    void setUp() {
        racingGame = new RacingGame(new String[] { "test1", "test2", "test3" });
    }

    @Test
    void 여러_라운드동안_전진하지_않는다() {
        GameResult gameResult = racingGame.race(3, () -> false);
        int[] roundPositions = get3RoundPositions(gameResult);
        assertArrayEquals(new int[] { 0, 0, 0 }, roundPositions);
    }

    @Test
    void 여러_라운드동안_전진한다() {
        GameResult gameResult = racingGame.race(3, () -> true);
        int[] roundPositions = get3RoundPositions(gameResult);
        System.out.println(gameResult);
        assertArrayEquals(new int[] { 3, 3 * 2, 3 * 3 }, roundPositions);
    }

    private int[] get3RoundPositions(GameResult gameResult) {
        String[] driveResults = gameResult.toString().split("\n");

        int[] roundPositions = new int[3];
        for (int i = 0; i < 12; i += 4) {
            int roundPosition = getPositions(driveResults[i]);
            roundPosition += getPositions(driveResults[i+1]);
            roundPosition += getPositions(driveResults[i+2]);

            roundPositions[i/3] = roundPosition;
        }

        return roundPositions;
    }

    private int getPositions(String driveResult) {
        return (int) Arrays.stream(driveResult.split(""))
                .filter(c -> "-".equals(c))
                .count();
    }

    @Test
    void 가장_많이_전진한_참여자를_우승자로_선정한다() {
        List<DriveResult> driveResults = new ArrayList<>();

        Car winnerCar = new Car("win");
        Car loserCar = new Car("lose");
        Car loserCar2 = new Car("lose2");

        driveResults.add(winnerCar.drive(() -> true));
        driveResults.add(loserCar.drive(() -> false));
        driveResults.add(loserCar2.drive(() -> false));

        RaceResult raceResult = new RaceResult(driveResults);
        GameResult gameResult = new GameResult(List.of(raceResult));

        String[] winners = getWinners(gameResult);
        assertEquals(1, winners.length);
        assertEquals("win", winners[0]);
    }

    private String[] getWinners(GameResult gameResult) {
        String[] lines = gameResult.toString().split("\n");
        String lastLine = lines[lines.length-1];

        String winnersStr = lastLine.substring(0, lastLine.indexOf("가 최종 우승"));
        return winnersStr.split(",");
    }
}
