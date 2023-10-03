import car.Car;
import car.MoveStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MovingStrategyTest {
    //- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
    private Car car;

    @BeforeEach
    void initCar(){
        car = new Car("name");
    }
    @Test
    void simple_move_test() {
        car.move();
        assertThat(car.getLocation()).isOne();
    }

    @Test
    void moveByStrategyTest(){
        car.moveByStrategy(3, value -> value >= 5);
        assertThat(car.getLocation()).isZero();

        car.moveByStrategy(9, value -> value > 5);
        assertThat(car.getLocation()).isOne();
    }
}
