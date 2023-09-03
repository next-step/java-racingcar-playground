package study.racingcar;

import java.util.List;

public class WonRacingCarInformer {

    public void informWonRacingCar(List<String> wonRacingCarNames) {

        StringBuilder informStatement = new StringBuilder();

        for (int i = 0; i < wonRacingCarNames.size(); i++) {
            informStatement.append(wonRacingCarNames).append(", ");
        }

        informStatement.delete(informStatement.length() - 2, informStatement.length());
        informStatement.append("가 최종 우승했습니다.");

        System.out.println(informStatement);

    }

}
