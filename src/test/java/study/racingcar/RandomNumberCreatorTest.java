package study.racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberCreatorTest {

    @Test
    @DisplayName("0 ~ 9 사이의 난수를 생성한다.")
    void createZeroToNineTest() {
        // given
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        // when
        int randomNumber = randomNumberCreator.createZeroToNine();

        // then
        assertThat(randomNumber).isGreaterThanOrEqualTo(0);
        assertThat(randomNumber).isLessThanOrEqualTo(9);
    }

}
