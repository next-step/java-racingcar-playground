package racingcarGame;

import org.junit.jupiter.api.Test;
import racingcarGame.domain.Car;
import racingcarGame.domain.Cars;
import racingcarGame.domain.Race;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {

//    @Test
//    void 차_1대_move_테스트() {
//        Car car1 = new Car("hhj");
//        Race race = new Race(car1);
//        race.race();
//        assertThat(car1.getLocation()).isEqualTo(1);
//    }


    @Test
    void 차_여러대_move_테스트() {
        Car car1 = new Car("hhj");
        Car car2 = new Car("hhj2");
        Car car3 = new Car("hhj3");
        Car car4 = new Car("hhj4");

        List<Car> car_list = Arrays.asList(car1,car2,car3,car4);

        Cars cars = new Cars(car_list);
        Race race = new Race(cars);
        race.race();
        assertThat(cars.getLocations()).isNotEqualTo(Arrays.asList(1,1,1,1));
    }
}
