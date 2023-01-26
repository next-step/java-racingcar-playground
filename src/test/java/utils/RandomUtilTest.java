package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static racingcar.RacingGame.RANDOM_NUMBER_BOUND;

public class RandomUtilTest {

    @Test
    @DisplayName("0~9 사이의 랜덤값 생성")
    void getRandomNumber() {
        for (int i = 0; i < 1000; i++) {
            int number = RandomUtil.getNumber(RANDOM_NUMBER_BOUND);

            assertThat(number >= 0).isTrue();
            assertThat(number < 10).isTrue();
        }
    }
}
