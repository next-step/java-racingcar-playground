package racing;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCar {

    public static void run() {

        try {
            List<Car> carList = NewCar(InputView.start());
            Cars cars = new Cars(carList);
            OutPutView.result(cars,InputView.count());
        } catch (IOException e) {
            e.printStackTrace();
            run();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            run();
        }
    }

    public static List<Car> NewCar(String[] car) {
        return Arrays.stream(car).map(a -> new Car(a)).collect(Collectors.toList());
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


    private static class OutPutView {
        static StringBuilder st = new StringBuilder();
        public static void result(Cars cars, int count) {
            System.out.println("실행 결과");
            for (int i = 0; i < count; i++) {
                cars.move(cars.getCar());
                cars.getCar().stream().forEach(car -> st.append(car.toString()));
                st.append("\n");
            }
            cars.WinName(cars.Maxdistance()).stream().forEach(car->st.append(car).append(","));
            st.replace(st.length() - 1, st.length(), "가 최종 우승했습니다.");
            System.out.println(st);
        }
    }
}
