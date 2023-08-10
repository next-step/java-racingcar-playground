package RacingGameTest;

import RacingGame.domain.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Car car;
    @BeforeEach
    void generateInstance() {
        car = new Car("truck");
    }

    @Test
    void goTest() {
        car.go(4);
        assertEquals(car.getCarPosition(),1);
        car.go(9);
        assertEquals(car.getCarPosition(), 2);
        car.go(3);
        assertEquals(car.getCarPosition(),2);
    }
}
