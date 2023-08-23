package racingGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class racingGamePlayTest {


    @Test
    void 자동차_4이상일때_전진() {
        Cars cars = new Cars("pobi,crong,honux");

        assertThat(cars.stopPlayCheck(4)).isEqualTo(CarStatus.PLAY);
    }

    @Test
    void 자동차_3이하일때_스탑() {
        Cars cars = new Cars("pobi,crong,honux");

        assertThat(cars.stopPlayCheck(3)).isEqualTo(CarStatus.STOP);
    }
}
