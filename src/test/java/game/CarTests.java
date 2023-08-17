package game;

import game.domain.Car;
import game.domain.DriveResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CarTests {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("이름");
    }

    @Test
    void 이름은_1글자_5글자_사이의_문자열이어야_한다() {
        assertThrows(IllegalArgumentException.class, () -> new Car(null));
        assertThrows(IllegalArgumentException.class, () -> new Car(""));

        assertDoesNotThrow(() -> new Car("1"));
        assertDoesNotThrow(() -> new Car("12"));
        assertDoesNotThrow(() -> new Car("123"));
        assertDoesNotThrow(() -> new Car("1234"));
        assertDoesNotThrow(() -> new Car("12345"));

        assertThrows(IllegalArgumentException.class, () -> new Car("123456"));
        assertThrows(IllegalArgumentException.class, () -> new Car("1234567"));
        assertThrows(IllegalArgumentException.class, () -> new Car("12345678"));
        assertThrows(IllegalArgumentException.class, () -> new Car("123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Car("1234567890"));
    }

    @Test
    void 확률적으로_전진하거나_가만히_있는다() {
        Set<Boolean> driveOrNot = new HashSet<>();

        int prevDrives = 0;
        for (int i = 0; i < 100; i++) {
            DriveResult driveResult = car.driveOrNot();

            int drives = getDrives(driveResult);
            driveOrNot.add(drives > prevDrives);

            prevDrives = drives;
        }

        assertEquals(driveOrNot.size(), 2);
    }

    public int getDrives(DriveResult driveResult) {
        return (int) Arrays.stream(driveResult.toString().split(""))
                .filter(str -> "-".equals(str))
                .count();
    }
}
