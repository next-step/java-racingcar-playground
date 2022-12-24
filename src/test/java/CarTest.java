import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void progress_over_4(){
        Racing racing = new Racing();
        int position = 3;
        Car car = new Car("pobi", position);
        car.progress(racing.randomGenerate());
        assertEquals(car.getPosition() , position+1);
    }
}
