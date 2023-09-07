package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTest {

    @Test
    @DisplayName("1 - 9 사이 수를 생성한다.")
    void createTest(){
        // given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        // when
        int randomNumber = randomNumberGenerator.create();

        // then
        assertThat(randomNumber).isGreaterThanOrEqualTo(1);
        assertThat(randomNumber).isLessThanOrEqualTo(9);

    }

}
