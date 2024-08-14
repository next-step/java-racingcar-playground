package car_racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    Car car1, car2;
    @BeforeEach
    void setUp() {
        car1 = new Car("pobi");
        car2 = new Car("crong");
    }
    @Test
    @DisplayName("자동차마다 갖게될 랜덤숫자 생성")
    void car_randomNum() {
        assertThat(car1.getRandomNum()).isNotZero();
        assertThat(car2.getRandomNum()).isNotZero();
    }
    @Test
    @DisplayName("자동차의 랜덤숫자가 4 이상일 때 점수에 축적")
    void car_addScore() {
        car1.addScore(2, 0);
        car2.addScore(4,2);
        assertThat(car1.getRaceScore()).isEqualTo(0);
        assertThat(car2.getRaceScore()).isEqualTo(3);
    }


}