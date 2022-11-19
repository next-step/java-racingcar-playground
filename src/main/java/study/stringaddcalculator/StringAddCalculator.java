package study.stringaddcalculator;

/**
 * 설명: 문자열 덧셈 계산기
 * <p>
 * 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
 * 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
 * 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
 * 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/16
 */
public class StringAddCalculator {

    public int calc(String parameter) {

        if (StringUtils.isEmpty(parameter)) {
            return 0;
        }

        if (parameter.length() == 1 && StringUtils.isNumeric(parameter)) {
            return Integer.parseInt(parameter);
        }

        // 개선..
        return new CustomTokenMatcher(parameter).getContent()
                .stream()
                .mapToInt(str -> {
                    if (!StringUtils.isNumeric(str)) {
                        throw new BadEnterException();
                    }
                    return Integer.parseInt(str);
                })
                .filter(number -> {
                    if (number < 0) {
                        throw new BadEnterException();
                    }
                    return true;
                }).sum();
    }


}
