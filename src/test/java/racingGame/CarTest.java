package racingGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car car;
    @BeforeEach
    void 자동차_생성() {
        car = new Car("pobi");
    }

    @Test
    void 글자수5개제한() {
        // expected
        assertThatThrownBy(() -> new Car("asdfgd"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void 숫자_4_이상이면_전진() {
        int beforeLine = car.line;
        car.play(4);

        assertThat(beforeLine+1).isEqualTo(car.line);
    }

    @Test
    void 숫자_3_이하면_멈춤() {
        int beforeLine = car.line;
        car.play(3);

        assertThat(beforeLine).isEqualTo(car.line);
    }

}
