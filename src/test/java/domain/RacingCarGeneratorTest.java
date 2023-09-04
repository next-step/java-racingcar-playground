package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarGeneratorTest {

    @Test
    @DisplayName("시합에 참여할 레이싱카들을 만듭니다.")
    void createTest(){
        // given
        String givenRacingCarNames = "pobi,crong";
        RacingCarGenerator racingCarGenerator = new RacingCarGenerator();
        // when
        List<RacingCar> racingCars = racingCarGenerator.create(givenRacingCarNames);

        // then
        assertThat(racingCars)
            .contains(new RacingCar("pobi"), new RacingCar("crong"));
    }

}
