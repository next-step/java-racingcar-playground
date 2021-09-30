package racing;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void 자동차_객체_생성_확인() {
        assertThat((new Car("abc")).getName()).isEqualTo("abc");
    }

    @Test
    void 자동차_움직임_구현() {
        Car car = new Car("test1");
        car.move((int) Math.round(Math.random()));
        assertThat(car.getLocation()).isLessThanOrEqualTo(1);
    }

    @Test
    void 자동차_5번_움직임_구현() {
        Car car = new Car("test1");
        for (int i = 0; i <= 5; i++) {
            car.move((int) Math.round(Math.random()));
        }
        System.out.println(car.getLocation());
        assertThat(car.getLocation()).isGreaterThanOrEqualTo(1);
        assertThat(car.getLocation()).isLessThanOrEqualTo(5);
    }

}
