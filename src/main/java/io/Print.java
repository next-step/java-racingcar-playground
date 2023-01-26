package io;

import racingcar.Car;

import java.util.List;
import java.util.stream.Collectors;

public class Print {

    public static void carNamesInput() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }
    
    public static void tryCountInput() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void result() {
        System.out.println("실행 결과");
    }

    public static void playResult(final Car car) {
        System.out.println(car.getName() + " : " + getPositionBar(car.getPosition()));
    }

    private static String getPositionBar(final int position) {
        final String bar = "-";
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < position; i++) {
            sb.append(bar);
        }

        return sb.toString();
    }

    public static void gameResult(final List<Car> cars) {
        final String winningCarsName = cars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));

        System.out.println(winningCarsName + "가 최종 우승했습니다.");
    }
}
