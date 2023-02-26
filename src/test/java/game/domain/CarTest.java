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
    void car_move_4미만() {
        Car car = new Car(5);
        assertThatThrownBy(() -> car.move(3))
                .isInstanceOf(java.lang.IllegalArgumentException.class)
                .hasMessageContaining("자동차는 최대 4이상 9이하 만큼만 움직일 수 있습니다.");
    }


}

