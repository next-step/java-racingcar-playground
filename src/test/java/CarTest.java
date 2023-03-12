import car.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarTest {

    @Test
    void go(){
        Car car = new Car("test");
        car.go(5);
        assertThat(car.getDistance()).isEqualTo(1);

        car.go(3);
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void checkCarNameLength(){

        assertThatThrownBy(() ->new Car("werwerwer")).isInstanceOf(IllegalArgumentException.class);
    }
}
