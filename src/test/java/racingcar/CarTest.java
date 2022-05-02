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
}
