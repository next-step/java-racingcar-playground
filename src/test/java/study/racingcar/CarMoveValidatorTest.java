package study.racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarMoveValidatorTest {

    @Test
    @DisplayName("랜덤값이 4 이상이면 움직일 수 있습니다.")
    void validMoveTest() {
        // given
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        CarMoveValidator carMoveValidator = new CarMoveValidator();
        int randomNumber = randomNumberCreator.createZeroToNine();

        // when
        boolean canMove = carMoveValidator.validMove(randomNumber);

        // then
        assertThat(canMove).isEqualTo(randomNumber >= 4);
    }

}
