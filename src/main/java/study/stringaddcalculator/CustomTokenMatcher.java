package study.stringaddcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
public class CustomTokenMatcher {

    private final Pattern CUSTOM_TOKEN_PATTERN = Pattern.compile("//(.)\n(.*)");

    private final String DEFAULT_TOKEN = ",|:";

    private final Matcher matcher;

    private final String content;

    public CustomTokenMatcher(String str) {
        this.matcher = CUSTOM_TOKEN_PATTERN.matcher(str);
        this.content = str;
    }

    public List<String> getContent() {
        if (isMatch()) {
            return Arrays.stream(matcher.group(2).split(getCustomDelimiter()))
                    .collect(Collectors.toList());
        }
        return Arrays.stream(content.split(DEFAULT_TOKEN)).collect(Collectors.toList());
    }

    private String getCustomDelimiter() {
        return matcher.group(1);
    }

    private boolean isMatch() {
        return matcher.find();
    }
}
