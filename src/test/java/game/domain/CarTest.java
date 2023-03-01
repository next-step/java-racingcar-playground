package game.domain;

import game.domain.Car;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    private ThrowableAssert.ThrowingCallable IllegalArgumentException;

    @Test
    void carname_5자이하() {
        Car car = new Car("pobi");
        assertThat(car).isNotNull();
    }

    @Test
    void car_move_4이상9이하() {
        Car car = new Car(5);
        int position = car.move(4);
        assertThat(position).isEqualTo(6);
    }

    @Test
    void car_move_0미만() {
        Car car = new Car(5);
        assertThatThrownBy(() -> car.move(-1))
                .isInstanceOf(java.lang.IllegalArgumentException.class)
                .hasMessageContaining("0이상 9이하에 해당하는 랜덤값이 주어져야 합니다");
    }
}

