package study.racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompetitionPreparer {

    public RacingCarNamesAndTotalCnt getRacingCarNamesAndTotalCnt() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String racingCarNames = br.readLine();

        System.out.println("시도할 회수는 몇회인가요?");

        int totalCnt = Integer.parseInt(br.readLine());

        System.out.println("실행결과");

        return new RacingCarNamesAndTotalCnt(racingCarNames, totalCnt);
    }

}
