package racinggame.domain;

import racinggame.domain.car.Cars;
import racinggame.domain.dto.RaceResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTests {
    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars(new String[] { "test1", "test2", "test3" });
    }

    @Test
    void 차들을_모두_전진시키거나_전진시키지_않는다() {
        RaceResult raceResult = cars.race(() -> false);
        int[] positions = getPositions(raceResult);
        assertArrayEquals(new int[] { 0, 0, 0 }, positions);

        raceResult = cars.race(() -> false);
        positions = getPositions(raceResult);
        assertArrayEquals(new int[] { 0, 0, 0 }, positions);
    }

    private int[] getPositions(RaceResult raceResult) {
        return Arrays.stream(raceResult.toString().split("\n"))
                .mapToInt(this::getPosition)
                .toArray();
    }

    private int getPosition(String driveResult) {
        return (int) Arrays.stream(driveResult.split("")).filter(c -> "-".equals(c)).count();
    }
}
