package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {

    private Racing racing;

    @BeforeEach
    void setUp() {
        racing = new Racing();
    }
    @Test
    @DisplayName("자동차 추가")
    void addCar() {
        racing.addCar("pobi");
        racing.addCar("crong");
        racing.addCar("honux");

        assertThat(racing.getCars().size()).isEqualTo(3);
        assertThat(racing.getCars()).extracting("name").containsExactly("pobi", "crong", "honux");
    }

    @Test
    @DisplayName("4미만 랜덤값")
    void lessThen4() {
        Car car = new Car("name");
        racing.checkNumberAndMove(car, 3);

        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("4이상 랜덤값-전진")
    void equalToOrGreaterThen4() {
        Car car = new Car("name");
        racing.checkNumberAndMove(car, 4);

        assertThat(car.getPosition()).isEqualTo(1);
    }
}
