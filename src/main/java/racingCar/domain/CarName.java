package racingCar.domain;

import java.util.Objects;

public class CarName {

    private static final int MAX_NO = 5;
    private final String name;

    public CarName(String name) {
        if (isBlank(name)){
            throw new IllegalArgumentException("이름의 길이가 1미만 5초과입니다.");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public boolean isBlank(String name) {
        return name.isEmpty() || name.length() >= MAX_NO;
    }

    @Override
    public String toString() {
        return name;
    }
}

