import car.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @Test
    void move_SUCCESS(){
        Car car = new Car("소나타"){
            @Override
            protected int getRandomNum() {
                return 4;
            }
        };
        car.move();
        assertThat(car.getLocation()).isEqualTo(2);
    }

    @Test
    void move_FAILURE(){
        Car car = new Car("소나타"){
            @Override
            protected int getRandomNum() {
                return 3;
            }
        };
        car.move();
        assertThat(car.getLocation()).isEqualTo(1);
    }
}