import car.Car;
import car.Cars;
import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {
    //## **기능 요구사항**
    //
    //- 각 자동차에 이름을 부여할 수 있다. **자동차 이름은 5자를 초과**할 수 없다.
    //- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
    //- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
    //- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
    //- **자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.**
    @Test
    void carNameTest() {
        String name = "car";
        Car car = new Car(name);
        assertThat(car.getName()).isEqualTo(name);
    }

    @Test
    void invalid_car_name_test() {
        String name = "more than 5 words";
        assertThatThrownBy(() -> new Car(name)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void carsTest() {
        String carNames = "car1, car2, car3"; // , 기준 split 및 trim 필요
        Cars cars = new Cars(carNames);
        assertThat(cars.getCarNames()).isEqualTo(List.of("car1", "car2", "car3"));
    }

    @Test
    void invalid_cars_name_test() {
        String carNames = "less, MoreThan5word, thisIsMoreThan5";
        assertThatThrownBy(() -> new Cars(carNames)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void justOneCarTest() {
        String carNames = "car1";
        Cars cars = new Cars(carNames);
        assertThat(cars.getCarNames()).isEqualTo(List.of("car1"));
    }

    @Test
    void moveTest(){
        Cars cars = new Cars("car1, car2");
        cars.moveForTest(5);
        assertThat(cars.getLocationByCarName("car1")).isEqualTo(1);
    }
}