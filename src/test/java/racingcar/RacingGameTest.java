package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    @DisplayName("자동차 이름은 쉼표(,)를 기준으로 구분")
    void carNamesAreSeparatedByCommas() {
        RacingGame racingGame = new RacingGame("pobi,crong,honux", 5);
        assertThat(racingGame.getCars())
                .containsExactly(new Car("pobi"), new Car("crong"), new Car("honux"));
    }

}
