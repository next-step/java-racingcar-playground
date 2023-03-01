package game.views;

import game.domain.Car;
import game.utils.RandomNum;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    public static void printInitCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printInitRepete() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printBeforeGame() {
        System.out.println("실행 결과");
    }

    public static void printRacingCars(List<Car> carList) {
        for (Car car : carList) {
            int randomNum = RandomNum.RandomMove();
            int position = car.move(randomNum);
            System.out.format("%s : %s", car.getCarName(), "-".repeat(position)+"\n");
        }
        System.out.println();
    }

    public static void printWinners(List<Car> Cars) {
        StringBuilder winnerBuilder = new StringBuilder();
        for (Car car : Cars) {
            winnerBuilder.append(String.format("%s, ", car.getCarName()));
        }
        String winners = winnerToStr(winnerBuilder);
        System.out.println(winners + "가 최종 우승했습니다.");
    }

    private static String winnerToStr(StringBuilder winners) {
        int length = winners.length();
        String result = winners.substring(0, length-2);
        return result;
    }
}
