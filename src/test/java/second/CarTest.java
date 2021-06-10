package second;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    public void 자동차_생성() {
        assertThat(new Car()).isInstanceOf(Car.class);
    }

}
