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

    public void printRoundResult(List<Car> cars) {
        System.out.println("실행 결과");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }
}
