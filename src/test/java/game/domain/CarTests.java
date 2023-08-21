package game.domain;

import game.domain.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CarTests {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("test");
    }

    @Test
    void 이름_5자_초과_시_예외가_발생한다() {
        assertDoesNotThrow(() -> new Car("12345"));
        assertThrows(IllegalArgumentException.class, () -> new Car("123456"));
    }

    @Test
    void MovingStrategy의_반환값에_따라_전진하거나_움직이지_않는다() {
        DriveResult driveResult = car.drive(() -> false);
        int position = getPosition(driveResult);
        assertEquals(0, position);

        driveResult = car.drive(() -> true);
        position = getPosition(driveResult);
        assertEquals(1, position);
    }

    private int getPosition(DriveResult driveResult) {
        return (int) Arrays.stream(driveResult.toString().split("")).filter(c -> "-".equals(c)).count();
    }
}
