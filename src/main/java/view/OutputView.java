package view;

import car.Cars;

import java.util.List;

public class OutputView {
    private static final String INPUT_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String INPUT_TRIALS = "시도할 회수는 몇회인가요?";
    private static final String IS_WINNER = "가 최종 우승했습니다.";
    private static final String LOCATION_EXPRESSION = "-";
    public void inputName(){
        System.out.println(INPUT_NAMES);
    }

    public void getTrial(){
        System.out.println(INPUT_TRIALS);
    }

    public void printLocations(Cars cars){
        List<String> carNames = cars.getCarNames();
        for (String carName : carNames) {
            System.out.println(carName + ":"+ intToMinus(cars.getLocationByCarName(carName)));
        }
    }

    public void printWinners(Cars cars){
        List<String> winners = cars.getWinnersNames();
        if (winners.size() == 1){
            System.out.println(winners.get(0) + IS_WINNER);
        }
        if (winners.size() > 1){
            StringBuilder sb = new StringBuilder();
            sb.append(String.join(", ", winners));
            sb.append(IS_WINNER);
            System.out.println(sb);
        }
    }

    private String intToMinus(int location){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < location; i++) {
            sb.append(LOCATION_EXPRESSION);
        }
        return sb.toString();
    }
}