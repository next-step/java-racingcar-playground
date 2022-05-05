package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("각 자동차에 이름을 부여할 수 있다.")
    void car_can_be_given_a_name() {
        Car car = new Car("aaron");
        assertThat(car).isEqualTo(new Car("aaron"));
    }

    @Test
    @DisplayName("자동차의 처음 위치는 0")
    void init_car_location_is_0() {
        Car car = new Car("aaron");
        assertThat(car).isEqualTo(new Car("aaron", 0));
    }

    @Test
    @DisplayName("자동차는 자신의 상태를 출력")
    void car_can_pring_state() {
        Car car = new Car("aaron", 4);
        assertThat(car.toString()).isEqualTo("aaron : -----");
    }

    @Test
    @DisplayName("자동차는 0에서 9 사이 Random 값이 4이상일 경우 전진")
    void car_can_forward_if_0_to_9() {
        Car car = new Car("aaron");
        car.forward(5);
        assertThat(car).isEqualTo(new Car("aaron", 1));
    }
}
