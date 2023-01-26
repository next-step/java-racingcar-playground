package carracinggame;
import org.junit.jupiter.api.Test;
import carracinggame.Car;
import carracinggame.CarRacingGame;
import carracinggame.CarValidation;
import carracinggame.Cars;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


public class CarRacingGameTest {
    @Test
    void 글자수_검증(){
        assertThat(CarValidation.validateNameLength("test")).isTrue();
    }

    @Test
    void 배열_검증(){
        String[] carNames= CarRacingGame.getCarnameArray("pobi,crong,honux");
        assertThat(carNames).containsExactly("pobi","crong","honux");
    }

    @Test
    void _4이상만_전진_조건(){

        int a= 4;
        int b= 2;
        MovingStrategy movingStrategy= new RandomMovingStrategy();
        assertThat(movingStrategy.movable()).isTrue();
        assertThat(movingStrategy.movable()).isFalse();
    }

    @Test
    void _이동(){
        Car car1= new Car("pobi",1);
        car1.advance(()->true);
        assertThat(car1.getProgress()).isEqualTo(2);
        car1.advance(()->false);
        assertThat(car1.getProgress()).isEqualTo(2);
    }

    @Test
    void 승자검증(){
        Car car1= new Car("pobi",1);
        Car car2= new Car("crong",2);
        Car car3= new Car("honux",3);
        Cars cars= new Cars(new ArrayList<>());
        cars.addCar(car1);
        cars.addCar(car2);
        cars.addCar(car3);
        assertThat(CarRacingGame.judgeTheWinner(cars)).containsExactly("honux");
    }
}
