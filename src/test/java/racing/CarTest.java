package racing;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void 자동차_객체_생성_확인() {
        assertThat((new Car("abc")).getName()).isEqualTo("abc");
    }

    @Test
    void 문자열_자동차_객체_생성() {

        String carsName = "a,b,c";
        String[] car = carsName.split(",");
        List<Car> carList = Create.NewCar(car);
        Cars cars = new Cars(carList);
        assertThat(cars.getCar().size()).isEqualTo(3);
    }

    @Test
    void 자동차_움직임_구현() {
        Car car = new Car("test1");
        car.move((int) Math.round(Math.random()));
        assertThat(car.getLocation()).isLessThanOrEqualTo(1);
    }

    @Test
    void 자동차_5번_움직임_구현() {
        Car car = new Car("test1");
        for (int i = 0; i <= 5; i++) {
            car.move((int) Math.round(Math.random()));
        }
        System.out.println(car.getLocation());
        assertThat(car.getLocation()).isGreaterThanOrEqualTo(1);
        assertThat(car.getLocation()).isLessThanOrEqualTo(5);
    }

    @Test
    void 자동차_그룹_움직임_구현() {
        String carsName = "a,b,c";
        String[] car = carsName.split(",");
        List<Car> carList = Create.NewCar(car);
        Cars cars = new Cars(carList);
        cars.move(carList);
        cars.getCar().stream().forEach(a -> System.out.println(a.toString()));
    }

    @Test
    void 자동차_그룹_5번_움직임_구현() {
        String carsName = "a,b,c";
        String[] car = carsName.split(",");
        List<Car> carList = Create.NewCar(car);
        Cars cars = new Cars(carList);
        for (int i = 0; i <= 5; i++) {
            cars.move(carList);
        }
        cars.getCar().stream().forEach(a -> System.out.println(a.toString()));
    }
}
