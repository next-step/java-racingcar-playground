import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarRacingTest {
    @Test
    void inputByComma(){
        InputView inputView = new InputView();
        String s = "one,two,three";
        String[] cars = inputView.getCars(s);
        assertThat(cars.length).isEqualTo(3);
    }

    @Test
    void carName_failureTest(){
        String name = "more than five words";
        assertThatThrownBy(() -> new Car(name));
    }
    @Test
    void randomTest(){
        Random random = new Random();
        System.out.println(random.nextInt(10));
    }
    @Test
    void carMoveTest(){
        Car car = new Car("12");
        while (car.getLocation() != 3){
            car.move();
        }
        assertThat(car.getLocation()).isEqualTo(3);
    }

    @Test
    void carsTest(){
        String[] nameArr = new String[]{"1", "2", "3"};
        Cars cars = new Cars(nameArr);
        for (int i = 0; i < 5; i++) {
            cars.move();
        }
        List<Car> cars1 = cars.getCars();
        int count = 0;
        for (Car car1 : cars1) {
            count += car1.getLocation();
        }
        assertThat(count).isGreaterThan(3); // 초기값 3보다는 어쨋든 움직일 확률이 매우 큼
    }
}
