package racingCar;

public class CarName {
    private final String name;
    private static final int MAX_NO = 5;

    public CarName(String name) {
        if (name.isEmpty() || name.length() >= MAX_NO){
            throw new IllegalArgumentException("이름의 길이가 1자 미만 5자 초과입니다. 다시입력해주세요.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
