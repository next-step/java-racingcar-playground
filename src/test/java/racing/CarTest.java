package racing;

import org.junit.jupiter.api.Test;

import java.util.List;

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
}
