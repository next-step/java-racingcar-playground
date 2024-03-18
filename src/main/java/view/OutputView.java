package view;

import model.Car;

import java.util.List;

public class OutputView {

    private static OutputView view;

    private OutputView() {}

    public static OutputView getInstance() {
        if (view == null) {
            view = new OutputView();
        }
        return view;
    }

    public void printResultMessage() {
        System.out.println("실행 결과");
    }

    public void printRoundResult(List<Car> cars) {
        System.out.println();
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }

    public void printGameResult(List<Car> winners) {
        StringBuilder sb = new StringBuilder();
        for (Car winner : winners) {
            sb.append(winner.getName()).append(", ");
        }
        if (!sb.isEmpty()) {
            sb.delete(sb.length()-2, sb.length());
            sb.append("가 최종 우승했습니다.");
        }
        System.out.println(sb.toString());
    }
}
