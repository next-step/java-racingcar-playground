package game.utils;

import org.apache.commons.lang3.StringUtils;

public class InputValid {
    private static final int MAX_MOVE = 9;
    private static final int MIN_MOVE = 4;

    public static void isNullCarNames(String carNames) {
        if (StringUtils.isBlank(carNames)) {
            throw new IllegalArgumentException("자동차 이름을 입력해 주세요.");
        }
    }

    public static boolean validMove(int moveNum) {
        if (moveNum > MAX_MOVE || moveNum < 0) {
            throw new IllegalArgumentException("0이상 9이하에 해당하는 랜덤값이 주어져야 합니다.");
        } else if (moveNum < MIN_MOVE) {
            return false;
        }
        return true;
    }
}
