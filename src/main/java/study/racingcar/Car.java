package study.racingcar;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
public class Car {

    private final String name;

    private final int MAXIMUM_NAME_LIMIT = 5;

    private int distance;

    public Car(String name) {

        if (name.length() > MAXIMUM_NAME_LIMIT) {
            throw new CarNamingOverException(MAXIMUM_NAME_LIMIT);
        }

        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public void forward() {
        this.distance++;
    }
}
