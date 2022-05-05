package racingcar;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Name {
    private final String name;

    public Name(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }

        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
        }

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name carName = (Name) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
