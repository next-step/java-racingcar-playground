package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    @Test
    @DisplayName("레이싱카는 주어진 값이 4 이상이면 움직입니다.")
    void moveTest() {
        //given
        RacingCar racingCar = new RacingCar("pobi");

        //when
        int randomNumber = 4;
        Position position = racingCar.move(randomNumber);

        // then
        assertThat(position).isEqualTo(new Position(1));
    }

}
