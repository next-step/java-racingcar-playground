package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("name");
    }

    @Test
    @DisplayName("Car 객체 생성")
    void createCar() {
        assertThat(car.getName()).isEqualTo("name");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 전진")
    void moveCar() {
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
