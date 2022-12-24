import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void printResult(){

    }

    @Test
    void endGame(){
        List<Car> cars = Arrays.asList(new Car("pobi", 4), new Car("crong", 2), new Car("honux", 4));
        List<Car> result = Result.endGame(cars);
        assertEquals(result.get(0).getName(), "pobi");
        assertEquals(result.get(0).getPosition(), 4);
        assertEquals(result.get(1).getName(), "honux");
        assertEquals(result.get(1).getPosition(), 4);
    }

}