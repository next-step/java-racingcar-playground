import car.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarTest {

    @Test
    void stop(){
        Car car = new Car("test");
        car.go(3);
        assertThat(car.getDistance()).isEqualTo(0);
    }
    @Test
    void go(){
        Car car = new Car("test");
        car.go(5);
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void goMoveView(){
        Car car = new Car("test");
        car.go(4);
        assertThat(car.moveView()).isEqualTo("test : -");
    }

    @Test
    void stopMoveView(){
        Car car = new Car("test");
        car.go(3);
        assertThat(car.moveView()).isEqualTo("test : ");
    }

    @Test
    void checkCarNameLength(){
        assertThatThrownBy(() ->new Car("werwerwer"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void carName(){
        Car car = new Car("test");
        assertThat(car.getName()).isEqualTo("test");
    }
}
