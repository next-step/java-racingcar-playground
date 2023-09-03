package study.racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GoalLineTest {

    @Test
    @DisplayName("경주 대회 최종 우승자를 알립니다")
    void informWonRacingCarsTest() {

        // given
        List<RacingCar> racingCars = new ArrayList<>();
        GoalLine goalLine = new GoalLine();

        // when
        List<String> wonRacingCarNamesList = goalLine.informWonRacingCars(racingCars);

        // then
        assertThat(wonRacingCarNamesList).contains();

    }

}
