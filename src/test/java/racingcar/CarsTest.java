package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("우승자 리스트 반환")
    void returnOfTheWinner() {
        Car pobi = new Car("pobi", 5);
        Car aaron = new Car("aaron", 5);
        Car honux = new Car("honux", 3);
        Cars cars = new Cars(Arrays.asList(pobi, aaron, honux));
        List<Car> winners = cars.findWinners();

        assertThat(winners).containsExactly(new Car("pobi", 5), new Car("aaron", 5));
    }
}
