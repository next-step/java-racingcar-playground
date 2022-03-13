package study;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class StringAddCalculator {
	private final static String BASIC_DELIMITER = ",|:";

	public int splitAndSum(String str) {
		if(isNullOrEmpty(str)) {
			return 0;
		}

		String delimiter = getDelimiter(str);
		if(!delimiter.equals(BASIC_DELIMITER)) {
			str = str.substring(4);
		}

		return Arrays.stream(str.split(delimiter))
			.mapToInt((num) -> {
				if(num.matches("\\d*")){
					return Integer.parseInt(num);
				}
				throw new RuntimeException();
			}).sum();
	}

	public boolean isNullOrEmpty(String str) {
		return str == null || str.isEmpty();
	}

	public String getDelimiter(String str) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);

		if (m.find()) {
			return m.group(1) + "|" + BASIC_DELIMITER;
		}

		return BASIC_DELIMITER;
	}

}
