package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GoalLineTest {

    @Test
    @DisplayName("우승한 레이싱카들을 알려줍니다.")
    void informWinner() {
        // given
        List<RacingCar> racingCars = List.of(
            new RacingCar("pobi", new Position(3)),
            new RacingCar("crong", new Position(3)),
            new RacingCar("nobi, 2")
        );
        GoalLine goalLine = new GoalLine();

        // when
        List<RacingCar> racingCarList = goalLine.informWinner(racingCars);

        // then
        assertThat(racingCarList)
            .contains(
                new RacingCar("pobi", new Position(3)),
                new RacingCar("crong", new Position(3))
            );
    }

}
