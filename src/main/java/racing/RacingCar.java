package racing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class RacingCar {

    public static void run() {

        try {
            List<Car> carList = Create.NewCar(InputView.start());
            Cars cars = new Cars(carList);
            InputView.count();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            run();
        }
    }

    private static class InputView {

        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static String[] start() throws IOException {
            System.out.println("경주할 자동차 이름을 입력하세요 ");
            return (br.readLine()).split(",");
        }

        public static int count() throws IOException {
            System.out.println("시도할 횟수는 몇회 인가요?");
            return Validation.checkNegative(Integer.parseInt(br.readLine()));
        }
    }


}
