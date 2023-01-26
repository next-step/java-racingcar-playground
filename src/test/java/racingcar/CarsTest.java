package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars();
    }

    @Test
    @DisplayName("자동차 추가")
    void addCar() {
        cars.add("pobi");
        cars.add("crong");
        cars.add("honux");

        assertThat(cars.size()).isEqualTo(3);
        assertThat(cars.getCars()).extracting("name").containsExactly("pobi", "crong", "honux");
    }

    @Test
    @DisplayName("4미만 랜덤값")
    void lessThen4() {
        cars.add("name");
        cars.checkNumberAndMove(0, 3);

        assertThat(cars.getCar(0).getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("4이상 랜덤값-전진")
    void equalToOrGreaterThen4() {
        cars.add("name");
        cars.checkNumberAndMove(0, 4);

        assertThat(cars.getCar(0).getPosition()).isEqualTo(2);
    }

    @Test
    @DisplayName("우승 자동차 선정")
    void winningCars() {
        cars.add("pobi");
        cars.add("crong");
        cars.add("honux");

        cars.getCar(0).move();
        cars.getCar(2).move();

        assertThat(cars.getWinningCarNames()).extracting("name").containsExactly("pobi", "honux");
    }
}
