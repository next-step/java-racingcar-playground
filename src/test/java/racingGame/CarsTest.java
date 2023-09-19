package racingGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    void 자동차_여러개_생성() {
        cars = new Cars("pobi,crong,honux");
    }

    @Test
    void 자동차_여러개중_5글자넘는경우() {
        assertThatThrownBy(() -> new Cars("pobi,crongb,honux"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void 자동차_객체중_라인이_가장_큰값_찾기() {
        assertThat("pobi").isEqualTo(cars.lineCheck(Arrays.asList(4,3,3)));
    }

    @Test
    void 자동차_여러개중_가장_앞에_있는거_가져오기() {
        String carName = cars.play(
                    Arrays.asList(4,3,3)
                )
                .get(0)
                .carName;
        assertThat("pobi").isEqualTo(carName);
    }
}
