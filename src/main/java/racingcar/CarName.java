package racingcar;

import org.apache.commons.lang3.StringUtils;

public class CarName {
    private final String name;

    public CarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }

        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
        }

        this.name = name;
    }
}
