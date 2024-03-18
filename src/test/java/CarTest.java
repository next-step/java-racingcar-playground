import model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 이름은_5자_미만() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Car car = new Car("123456");
        });
    }

    @Test
    void move() {
        Car car = new Car("exam");
        Assertions.assertFalse(car.toString().contains("-"));
        car.move();
        Assertions.assertTrue(car.toString().contains("-"));
    }

    @Test
    void play() {
        Car car = new Car("exam");
        car.play(4);
        Assertions.assertEquals(1, car.getLocation());
        car.play(3);
        Assertions.assertEquals(1, car.getLocation());
    }

    @Test
    void sting() {
        Car car = new Car("hi");
        Assertions.assertEquals("hi",car.getName());
    }
}
