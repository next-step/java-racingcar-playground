package first;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 문자열_자동차생성() {
        assertThat(getCars("pobi,crong,honux").size()).isEqualTo(3);
    }

    @Test
    void 문자열_5자이상_자동차생성_오류() {
        assertThatThrownBy(() -> getCars("pobi,crong,codesweaver"));
    }

    @Test
    void 자동차_위치_생성() {
        Car car = new Car("crong");
        int position = car.getPosition();
        assertThat(position).isZero();
    }

    @Test
    void 난수_생성() {
        Random random = new Random();
        int i = random.nextInt(1);
        assertThat(i).isBetween(0, 1);
    }

    @Test
    void 플레이_게임() {
        new CarRacing("pobi,crong,honux").play();
    }

    private List<Car> getCars(String input) {
        String[] names = input.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }
}
