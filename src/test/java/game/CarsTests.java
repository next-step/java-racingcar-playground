package game;

import game.domain.Cars;
import game.domain.RoundResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarsTests {
    private Cars cars;

    @BeforeEach
    void setUp() {
        String[] carNames = { "a", "b", "c" };
        cars = new Cars(carNames);
    }

    @Test
    void 빈_배열로는_생성할_수_없다() {
        assertThrows(IllegalArgumentException.class,() -> new Cars(new String[] {}));
    }

    @Test
    void 모든_차를_확률적으로_전진시킨다() {
        Set<Boolean>[] driveOrNots = new HashSet[3];
        for (int i = 0; i < 3; i++) {
            driveOrNots[i] = new HashSet<>();
        }

        int[] prevDrivesArr = new int[3];
        for (int i = 0; i < 100; i++) {
            RoundResult roundResult = cars.playRound();

            int[] drivesArr = getDrivesArr(roundResult);
            updateDriveOrNots(driveOrNots, prevDrivesArr, drivesArr);

            prevDrivesArr = Arrays.copyOf(drivesArr, drivesArr.length);
        }

        for (int i = 0; i < 2; i++) {
            assertEquals(driveOrNots[i].size(), 2);
        }
    }

    private int[] getDrivesArr(RoundResult roundResult) {
        String[] strDriveResults = roundResult.toString().split("\n");

        int[] drivesArr = new int[strDriveResults.length];
        for (int i = 0; i < strDriveResults.length; i++) {
            drivesArr[i] = (int) Arrays.stream(strDriveResults[i].split(""))
                    .filter(str -> "-".equals(str))
                    .count();
        }

        return drivesArr;
    }

    private void updateDriveOrNots(Set<Boolean>[] driveOrNots, int[] prevDrivesArr, int[] drivesArr) {
        for (int i = 0; i < driveOrNots.length; i++) {
            int prev = prevDrivesArr[i];
            int cur = drivesArr[i];
            driveOrNots[i].add(cur > prev);
        }
    }
}
