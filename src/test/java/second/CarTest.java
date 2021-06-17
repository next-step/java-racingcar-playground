package second;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_생성() {
        assertThat(new Car()).isInstanceOf(Car.class);
    }

    @Test
    void 자동차_전진() {
        Car car = new Car("crong");

        car.play();
        assertThat(car.getPosition()).isEqualTo(1);

        car.play();
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @Test
    void 난수_생성() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            assertThat(random.nextInt(2)).isBetween(0, 1);
        }
    }
}
