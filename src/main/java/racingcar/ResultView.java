package racingcar;

import java.util.List;

public class ResultView {
    public void start() {
        System.out.println("\n실행 결과");
    }

    public void printState(Cars cars) {
        System.out.println(cars.toString());
    }

    public void end(List<Car> winner) {
        StringBuilder sb = new StringBuilder();
        int size = winner.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(winner.get(0).getName());
        }
        sb.append("가 최종 우승했습니다.");
        System.out.println(sb);
    }
}
