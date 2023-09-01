import java.util.List;

public class OutputView {
    public void inputName(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public void getTrial(){
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void result(Cars cars){
        List<Car> carList = cars.getCars();
        for (Car car : carList) {
            System.out.println(carInfo(car));
        }
    }

    public void winner(Cars cars){
        List<String> winners = cars.winners();
        if (winners.size() == 1){
            System.out.println(winners.get(0) + "가 최종 우승했습니다.");
        }
        if (winners.size() > 1){
            StringBuilder sb = new StringBuilder();
            sb.append(String.join(", ", winners));
            sb.append("가 최종 우승했습니다.");
            System.out.println(sb.toString());
        }
    }

    private String carInfo(Car car) {
        return car.getName() + " : " + intToMinus(car.getLocation());
    }

    private String intToMinus(int location){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < location; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
