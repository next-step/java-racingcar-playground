package racingcarGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcarGame.domain.Car;
import racingcarGame.domain.Cars;

import java.util.Arrays;
import java.util.List;

public class CarsTest {

    @Test
    void 차_여러대_생성(){
        Car car1 = new Car("hhj");
        Car car2 = new Car("hhj2");
        Car car3 = new Car("hhj3");
        Car car4 = new Car("hhj4");

        List<Car> car_list = Arrays.asList(car1,car2,car3,car4);

        Cars cars = new Cars(car_list);

        Assertions.assertThat(cars).isNotEqualTo(null);
    }
}
