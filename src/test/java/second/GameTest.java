package second;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    private Game game;

    @BeforeEach
    void setup() {
        game = new Game();
    }

    @Test
    void 이름_다섯자_유효_테스트() {
        assertThat("holux".length() > 5).isFalse();
    }

    @Test
    void 자동차_이름으로_여러개_생성() {
        game.addCars("pobi,crong,holux");
        assertThat(game.getCars().size()).isEqualTo(3);
    }

    @Test
    void 자동차_직접_주입() {
        game.addCar(new Car("crong"));
        assertThat(game.getCars().size()).isEqualTo(1);
    }

    @Test
    void 승자뽑기_1위_1명() {
        game.addCar(new Car("pobi", 5));
        game.addCar(new Car("crong", 4));
        game.addCar(new Car("holux", 4));

        List<Car> winner = game.getWinners();
        assertThat(winner.get(0).getName()).isEqualTo("pobi");
    }

    @Test
    void 승자뽑기_1위_2명() {
        Car pobi = new Car("pobi", 5);
        Car crong = new Car("crong", 5);
        Car holux = new Car("holux", 1);
        game.addCar(pobi);
        game.addCar(crong);
        game.addCar(holux);

        List<Car> winners = game.getWinners();

        assertThat(winners.size()).isEqualTo(2);
        assertThat(winners).contains(pobi, crong);
    }

    @Test
    void 승자뽑기_1위_3명() {
        Car pobi = new Car("pobi", 2);
        Car crong = new Car("crong", 2);
        Car holux = new Car("holux", 2);
        game.addCar(pobi);
        game.addCar(crong);
        game.addCar(holux);

        List<Car> winners = game.getWinners();

        assertThat(winners.size()).isEqualTo(3);
        assertThat(winners).contains(pobi, crong, holux);
    }

//    @Test
//    void 승자출력_1위_1명() {
//        game.addCar(new Car("pobi", 5));
//        game.addCar(new Car("crong", 4));
//        game.addCar(new Car("holux", 4));
//
//        List<Car> winners = game.getWinners();
//        game.printWinners(winners);
//    }
//
//    @Test
//    void 승자출력_1위_2명() {
//        game.addCar(new Car("pobi", 5));
//        game.addCar(new Car("crong", 5));
//        game.addCar(new Car("holux", 4));
//
//        List<Car> winners = game.getWinners();
//        game.printWinners(winners);
//    }
//
//    @Test
//    void 플레이_테스트() {
//        game.addCars("pobi,crong,holux");
//        game.setPlayCount(5);
//        game.play();
//    }
}