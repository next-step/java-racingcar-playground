package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static final String MINUS_REGEX = "-";

    public int plus(String[] input) {
        int sum = 0;
        checkCorrectNumeric(input);

        List<Integer> nums = changeToIntNums(input);
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
    // 1. 숫자 이외의 값 있는지 검증 2. 음수인지 검증
    private List<Integer> changeToIntNums(String[] input) {
        List<Integer> nums = new ArrayList<>();
        for (String i : input) {
            nums.add(Integer.parseInt(i));
        }
        return nums;
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || "".equals(str);
    }

    /**
     * 1. 정규식
     * 2. Double.parseDouble()을 통해 catch문 시 return false
     * TODO two depth...
      */
    private void checkCorrectNumeric(String[] str) {
        for (int i = 0; i < str.length; i++) {
            if(isNullOrEmpty(str[i])) {
                str[i] = "0";
                continue;
            }
            if(str[i].matches("[^0-9]")) {
                throw new RuntimeException("숫자 외의 값은 불가능합니다.");
            }
            if (str[i].startsWith(MINUS_REGEX)) {
                throw new RuntimeException("0 이상의 정수만 가능합니다.");
            }
        }
    }
}
