package study.racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/19
 */
public class RacingCarConsoleView implements RacingCarInputView {

    private final Scanner scanner = new Scanner(System.in);

    private static final String INPUT_SEPARATOR = ",";

    private static final String INDICATOR = "-";

    @Override
    public List<Car> inputCars() {
        System.out.printf("경주할 자동차 이름을 입력하세요(이름은 쉼표(%s)를 기준으로 구분).%n", INPUT_SEPARATOR);
        return Arrays.stream(scanner.next().split(INPUT_SEPARATOR))
                .map(s-> new Car(s.trim()))
                .collect(Collectors.toList());
    }

    @Override
    public int inputNumberOfAttempt() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }

    @Override
    public void print(List<Car> cars) {
        cars.forEach(car -> {
            System.out.printf("%s : %s %n", car.getName(), getMovingDistance(car.getDistance()));
        });
        System.out.println();
    }

    @Override
    public void printResultLabel() {
        System.out.println("실행 결과");
    }

    @Override
    public void printWinners(List<Car> cars) {
        System.out.printf("%s가 최종 우승했습니다.", cars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(",")));
    }

    private String getMovingDistance(int distance) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < distance; i++) {
            result.append(INDICATOR);
        }
        return result.toString();
    }
}
