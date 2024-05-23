package racingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.domain.Car;
import racingCar.domain.Position;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp(){
        car = new Car("gabi");
    }

    @DisplayName("4이상일경우 전진")
    @Test
    void move(){
        assertThat(car.move(4)).isEqualTo(new Position(2));
    }

    @DisplayName("4미만인경우 멈춤")
    @Test
    void stop(){
        assertThat(car.move(3)).isEqualTo(new Position(1));
    }
}
