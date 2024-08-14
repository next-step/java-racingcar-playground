package car_racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {
    Car car1, car2, car3;
    @BeforeEach
    void setup(){
        car1 = new Car("pobi");
        car2 = new Car("crong");
        car3 = new Car("honux");
    }

    @Test
    @DisplayName("3번를 진행할 때 가질 수 있는 max값은 회차 수와 같다")
    void car_racing() {
        String[] names = {"pobi", "crong", "honux"};
        Cars cars = new Cars(names);
        for (int i = 1; i <= 3; i++) {
            List<Car> carResult = cars.play(); // 1~3회 진행
            assertThat(carResult.get(0).getRaceScore()).isLessThanOrEqualTo(i); // i이하
            assertThat(carResult.get(1).getRaceScore()).isLessThanOrEqualTo(i); // i이하
            assertThat(carResult.get(2).getRaceScore()).isLessThanOrEqualTo(i);  // i이하
        }

    }

    @Test
    @DisplayName(("종료 후 가장 높은 raceScore 을 보유한 List<Car> 출력 - 무조건 1개 이상"))
    void find_highestScore() {
        String[] names = {"pobi", "crong", "honux"};
        Cars cars = new Cars(names);
        for (int i = 1; i <= 3; i++) {
            cars.play(); // 3회 진행
        }
        assertThat(cars.findHighestScore()).isNotNull();
    }

}