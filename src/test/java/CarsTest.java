import car.Cars;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    void play(){
        Cars cars = new Cars("kia,volvo,pobi");
        cars.play(5);
    }

    @Test
    void winner(){
        Cars cars = new Cars("kia,volvo,pobi");
        cars.play(5);


    }
}
