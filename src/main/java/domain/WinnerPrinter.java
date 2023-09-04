package domain;

import java.util.List;
import java.util.stream.Collectors;

public class WinnerPrinter {

    public void print(List<RacingCar> winners) {

        List<String> winnerName = winners.stream().map(RacingCar::getCarName)
            .collect(Collectors.toList());

        StringBuilder winner = new StringBuilder();

        for (String racingCarName : winnerName) {
            winner.append(racingCarName).append(", ");
        }

        winner.delete(winner.length() - 2, winner.length());

        System.out.println(winner);
    }
}
