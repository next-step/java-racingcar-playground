package RacingGame.view;

import RacingGame.DTO.Cars;
import RacingGame.domain.Car;

import java.util.ArrayList;

public class ResultView {

    public void printRoundResult(Cars cars) {
        for(int i=0; i<cars.getJoinedCar().size(); i++){
            Car car = cars.getJoinedCar().get(i);
            String name = car.getCarName();
            int position = car.getCarPosition();
            System.out.println(name+" : "+viewPosition(position));
        }
    }
    private String viewPosition(int position) {
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
    public void printWinner(Cars cars) {
        printRoundResult(cars);
        ArrayList<Car> carsList = cars.getJoinedCar();
        ArrayList<Car> winners = new ArrayList<>();
        int highPosition = -1;

        for (Car car : carsList) {
            int position = car.getCarPosition();
            if(position > highPosition) {
                highPosition = position;
                winners.clear();
                winners.add(car);
                continue;
            }
            if(position == highPosition) {
                winners.add(car);
            }
        }
        System.out.println(winnersName(winners)+"가 최종우승했습니다");

    }
    private String winnersName(ArrayList<Car> winners) {
        if(winners.size() == 1) {
            return winners.get(0).getCarName();
        }
        StringBuilder winnersName = new StringBuilder();
        for (int i=0; i<winners.size(); i++) {
            if(i == winners.size()-1) {
                winnersName.append(winners.get(i).getCarName());
                continue;
            }
            winnersName.append(winners.get(i).getCarName()+",");
        }
        return winnersName.toString();
    }
}
