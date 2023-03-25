package racing;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGameOrganizer {

    public List<RacingCar> createCars(String carNames) {
        return Arrays.stream(carNames.split(","))
                .map(RacingCar::new)
                .collect(Collectors.toList());
    }

    public void play(List<RacingCar> racingCars, int loopCount) {

        System.out.println("실행 결과");
        for (int i = 0; i < loopCount; i++) {
            racingCars.forEach(car -> car.play(createGameNumber()));
            racingCars.forEach(System.out::println);
            System.out.println();
        }
    }

    public void result(List<RacingCar> racingCars) {
        List<RacingCar> winnerCars = getWinnerCars(racingCars);
        int size = winnerCars.size();

        for (int i = 0; i < size; i++) {
            System.out.print(winnerCars.get(i).getName());
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("가 최종 우승했습니다.");
    }

    private List<RacingCar> getWinnerCars(List<RacingCar> racingCars) {
        int maxPosition = racingCars.stream()
                .mapToInt(RacingCar::getPosition)
                .max()
                .orElse(0);

        System.out.println("최대 값 : " + maxPosition);
        return racingCars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    public int createGameNumber() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(8) + 1;
    }
}