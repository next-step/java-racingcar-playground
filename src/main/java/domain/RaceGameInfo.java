package domain;

public class RaceGameInfo {

    private final String racingCarNames;
    private final int raceCount;

    public RaceGameInfo(String racingCarNames, int raceCount) {
        this.racingCarNames = racingCarNames;
        this.raceCount = raceCount;
    }

    public String getRacingCarNames() {
        return racingCarNames;
    }

    public int getRaceCount() {
        return raceCount;
    }
}
