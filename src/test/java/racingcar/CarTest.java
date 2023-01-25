package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("Car 객체 생성")
    void createCar() {
        Car car = new Car("name");
        assertThat(car.getName()).isEqualTo("name");
    }
}
