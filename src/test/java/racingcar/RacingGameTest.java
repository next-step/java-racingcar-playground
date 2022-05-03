package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    @DisplayName("자동차 이름은 쉼표(,)를 기준으로 구분")
    void CarNamesAreSeparatedByCommas() {
        RacingGame racingGame = new RacingGame("pobi,crong,honux", 5);
        assertThat(racingGame.getCars()).isEqualTo(new Cars("pobi,crong,honux"));
    }
}
