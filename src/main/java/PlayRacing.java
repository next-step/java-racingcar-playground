import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayRacing {

    public static void main(String[] args) {
        new PlayRacing().racingGameStart();
    }
    public void racingGameStart(){
        List<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String s = scanner.nextLine();
        String[] split = s.split(",");

        for(String carName : split){
            cars.add(new Car(carName));
        }

        System.out.println("시도할 횟수를 입력허세요.");

        int cnt = scanner.nextInt();

        for(int i = 0; i < cnt; i++){
            System.out.println("===========================");
            raceStart(cars);
            System.out.println("===========================");
        }
        getWinner(cars);
    }

    private void raceStart(List<Car> cars){
        for(Car car : cars)
            car.race();
    }

    private void getWinner(List<Car> cars){
        Collections.sort(cars);
        StringBuffer sb = new StringBuffer();
        sb.append(cars.get(0));
        for(int i = 1; i < cars.size(); i++){
            if(cars.get(0).getCurrentLocation() == cars.get(i).getCurrentLocation())
                sb.append(", " + cars.get(i).getName());
        }
        System.out.println(sb + "가 우승했습니다.");

    }
}
