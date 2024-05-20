package racingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car car1;
    private Car car2;

    @BeforeEach
    void setUp(){
        car1 = new Car("gabe");
        car2 = new Car("abc");
    }

    @DisplayName("자동차 전진하는 기능")
    @Test
    void 자동차전진(){
        assertThat(car1.process(4)).isEqualTo(2);
        assertThat(car2.process(3)).isEqualTo(1);
    }



}
