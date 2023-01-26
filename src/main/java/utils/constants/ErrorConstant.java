package utils.constants;

import static utils.NameUtil.NAME_MAX_LENGTH;

public class ErrorConstant {

    private ErrorConstant() {
    }

    public static final String INVALID_INPUT = "잘못된 입력입니다. 다시 입력해주세요.";
    public static final String INVALID_CAR_NAME = "잘못된 이름입니다. 다시 입력해주세요.";
    public static final String NOT_NUMBER = "숫자만 입력할 수 있습니다. 다시 입력해주세요.";
    public static final String INVALID_COMMA_LOCATION = "자동차 이름은 쉼표(,)를 기준으로 구분합니다. 다시 입력해주세요.";
    public static final String CAR_NAME_MORE_THEN_MAX_LENGTH = "자동차 이름은 " + NAME_MAX_LENGTH + "글자를 초과할 수 없습니다. 다시 입력해주세요.";
}
