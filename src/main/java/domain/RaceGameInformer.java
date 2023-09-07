package domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RaceGameInformer {

    public RaceGameInfo InformRaceGameInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String racingCarNames = br.readLine();
        int raceCount = Integer.parseInt(br.readLine());
        return new RaceGameInfo(racingCarNames, raceCount);

    }

}
