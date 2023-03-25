import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racing.RacingCar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingCarTest {

    @Test
    @DisplayName("자동차 생성시 이름과 현재 위치 0값을 가진다.")
    void test1() {
        RacingCar car = new RacingCar("june");
        assertThat(car.getName()).isEqualTo("june");
        assertThat(car.getPosition()).isZero();
    }

    @Test
    @DisplayName("자동차 생성 시 이름이 5글자 초과시 [IllegalArgumentException] 예외가 발생한다.")
    void test2() {
        assertThatThrownBy(() -> new RacingCar("testCar"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource(value = {"0:0", "3:0", "4:1", "9:1"}, delimiter = ':')
    @DisplayName("자동차는 play 파라미터 값이 4 이상일 경우 1전진한다.")
    void test3(int input, int expected) {
        RacingCar car = new RacingCar("june");
        car.play(input);
        assertThat(car.getPosition()).isEqualTo(expected);
    }
}
