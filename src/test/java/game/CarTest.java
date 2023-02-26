package game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void carname_5자이하() {
        Car car = new Car("pobi");
        assertThat(car).isNotNull();
    }

}
