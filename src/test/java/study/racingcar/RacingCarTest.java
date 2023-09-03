package study.racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    @Test
    @DisplayName("경주차는 random숫자가 4 이상이면 움직인다.")
    void moveTest() {

        // given
        RacingCar racingCar = RacingCar.create("racingCar");
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        int randomNumber = randomNumberCreator.createZeroToNine();

        // when
        racingCar.move(randomNumber);

        // then
        assertThat(racingCar.getMoveCnt()).isEqualTo(randomNumber >= 4 ? 1 : 0);
    }

}
