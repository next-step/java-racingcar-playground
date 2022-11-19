package study.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/19
 */
class CarTest {

    @Test
    @DisplayName("자동차를 5자 초과하는 이름으로 생성시 예외 테스트")
    void createCarNamingOverExceptionTest() {
        assertThatThrownBy(() -> new Car("5자넘는이름"))
                .isInstanceOf(CarNamingOverException.class);
    }

    @Test
    @DisplayName("전진 테스트")
    void forwardTest() {
        Car car = new Car("테스트카");
        car.forward();
        assertThat(car.getDistance()).isEqualTo(1);
    }
}
