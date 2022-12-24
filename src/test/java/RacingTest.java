import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class RacingTest {

    @Test
    void randomGenerate_random_1_9(){
        int num = Racing.randomGenerate();
        assertTrue(num <= 9 );
        assertTrue(num >= 0 );
    }

    @Test
    @DisplayName("Racing의 this.game은 1이 줄어들고, progress는 진행한다.")
    void play(){
        Racing racing = new Racing();
        List<Car> cars = racing.start("pobi,crong,honux",4);
        racing.play();
        assertEquals(racing.getGame(),3);
        assertEquals(cars.get(0).getName(), "pobi");
        assertEquals(cars.get(1).getName(), "crong");
        assertEquals(cars.get(2).getName(), "honux");
    }



}
