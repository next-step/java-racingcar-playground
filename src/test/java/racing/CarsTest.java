package racing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    List<Car> carList;
    Cars cars;

    @BeforeEach
    public void setUp() {
        String carsName = "a,b,c";
        String[] car = carsName.split(",");
        carList = RacingCar.NewCar(car);
        cars = new Cars(carList);
    }
    @Test
    void 문자열_자동차_객체_생성() {
        assertThat(cars.getCar().size()).isEqualTo(3);
    }

    @Test
    void 자동차_그룹_움직임_구현() {
        cars.move(carList);
        cars.getCar().stream().forEach(a -> System.out.println(a.toString()));
    }

    @Test
    void 자동차_그룹_5번_움직임_구현() {
        for (int i = 0; i <= 5; i++) {
            cars.move(carList);
        }
        cars.getCar().stream().forEach(a -> System.out.println(a.toString()));
    }

    @Test
    void 자동차_승자_확인() {
        for (int i = 0; i <= 5; i++) {
            cars.move(carList);
        }
        cars.getCar().stream().forEach(a -> System.out.println(a.toString()));
        cars.WinName(cars.Maxdistance()).forEach(System.out::println);
        assertThat(cars.WinName(cars.Maxdistance())).hasSizeGreaterThanOrEqualTo(1);
    }
}
