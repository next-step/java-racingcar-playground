import car.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarTest {

    @Test
    void compareDistance(){
        Car car1 = new Car("test1");
        car1.go(5);

        Car car2 = new Car("test2");
        car2.go(3);

        assertThat(car1.compareDistance(car2)).isEqualTo(1);

        car1.go(1);
        car2.go(5);

        assertThat(car1.compareDistance(car2)).isEqualTo(0);


        car1.go(1);
        car2.go(5);
        assertThat(car1.compareDistance(car2)).isEqualTo(-1);
    }
    @Test
    void go(){
        Car car = new Car("test");
        car.go(5);
        car.go(3);
    }

    @Test
    void checkCarNameLength(){

        assertThatThrownBy(() ->new Car("werwerwer"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
