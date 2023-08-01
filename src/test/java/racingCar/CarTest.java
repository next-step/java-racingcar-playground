package racingCar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringCalculator.StringAddCalculator;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("자동차의 이름은 5자를 초과하면 RuntimeException을 응답한다.")
    void test1() {
        String value = "nextStep";

        assertThatThrownBy(() -> Car.validate(value))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("랜덤값이 4 이상일 경우 한칸 이동")
    void test2() {
        Car car = new Car("hello");

        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }
}