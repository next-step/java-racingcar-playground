package study.racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;

import java.util.List;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarCreatorTest {

    @Test
    @DisplayName("경주에 참여할 레이싱 카들을 입력할 수 있다.")
    void createRacingCar() {
        // given
        List<String> givenRacingCarList = List.of("pobi", "crong", "honux");

        // when
        RacingCarCreator racingCarCreator = new RacingCarCreator();
        List<RacingCar> racingCars = racingCarCreator.createRacingCars(givenRacingCarList);

        // then
        assertThat(racingCars)
            .extracting("name", "moveCnt")
            .contains(
                tuple("pobi", 0),
                tuple("crong", 0),
                tuple("honux", 0)
            );
    }

}
