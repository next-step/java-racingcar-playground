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
//        assertThat(cars.lineCheck(Arrays.asList(4,4,3))).isEqualTo("pobi,crong");
    }

    @Test
    void 자동차_게임_시작후_우승자_알려주기() {
        assertThat(cars.play(5)).isEqualTo("pobi,crong");
    }

}
