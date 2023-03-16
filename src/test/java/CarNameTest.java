import car.CarName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarNameTest {
    @Test
    void create(){
        assertThatThrownBy(()-> new CarName("setsss")).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(()-> new CarName("")).isInstanceOf(IllegalArgumentException.class);
    }
}
