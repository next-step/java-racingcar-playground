package study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringAddCalculatorTest {
	StringAddCalculator stringAddCalculator;

	@BeforeEach
	void setUp() {
		stringAddCalculator = new StringAddCalculator();
	}

	@Test
	void null_또는_빈문자() {
		assertThat(stringAddCalculator.splitAndSum("")).isEqualTo(0);
		assertThat(stringAddCalculator.splitAndSum(null)).isEqualTo(0);
	}

	@Test
	void 숫자_1개() {
		assertThat(stringAddCalculator.splitAndSum("5")).isEqualTo(5);
		assertThat(stringAddCalculator.splitAndSum("10")).isEqualTo(10);
	}

	@Test
	void 쉼표_구분자() {
		assertThat(stringAddCalculator.splitAndSum("1,2")).isEqualTo(3);
		assertThat(stringAddCalculator.splitAndSum("12,3")).isEqualTo(15);
	}

	@Test
	void 콜론_구분자() {
		assertThat(stringAddCalculator.splitAndSum("1:2")).isEqualTo(3);
		assertThat(stringAddCalculator.splitAndSum("12:3")).isEqualTo(15);
	}

	@Test
	void 쉼표_AND_콜론() {
		assertThat(stringAddCalculator.splitAndSum("1:2:3,4")).isEqualTo(10);
		assertThat(stringAddCalculator.splitAndSum("1,2:3")).isEqualTo(6);
	}

	@Test
	void 커스텀_구분자() {
		assertThat(stringAddCalculator.splitAndSum("//!\n1!2!3")).isEqualTo(6);
		assertThat(stringAddCalculator.splitAndSum("//#\n1#2#3")).isEqualTo(6);
		assertThat(stringAddCalculator.splitAndSum("//;\n1;2;3")).isEqualTo(6);
	}

	@Test
	void 커스텀_구분자_AND_쉼표() {
		assertThat(stringAddCalculator.splitAndSum("//#\n1#2,3")).isEqualTo(6);
		assertThat(stringAddCalculator.splitAndSum("//;\n1;2,3")).isEqualTo(6);
	}

	@Test
	void 커스텀_구분자_AND_콜롬() {
		assertThat(stringAddCalculator.splitAndSum("//#\n1#2:3")).isEqualTo(6);
		assertThat(stringAddCalculator.splitAndSum("//;\n1;2:3")).isEqualTo(6);
	}

	@Test
	void 커스텀_구분자_AND_콜롬_AND_쉼표() {
		assertThat(stringAddCalculator.splitAndSum("//#\n1#2:3,4")).isEqualTo(10);
		assertThat(stringAddCalculator.splitAndSum("//;\n1;2:3,0")).isEqualTo(6);
	}

	@Test
	void 음수_포함() {
		assertThatThrownBy(() -> stringAddCalculator.splitAndSum("//#\n-1:2:3"))
			.isInstanceOf(RuntimeException.class);
	}

	@Test
	void 정수가_아닌_입력값() {
		assertThatThrownBy(() -> stringAddCalculator.splitAndSum("//#\na:32b:3"))
			.isInstanceOf(RuntimeException.class);

		assertThatThrownBy(() -> stringAddCalculator.splitAndSum("//#\n1a:b:3"))
			.isInstanceOf(RuntimeException.class);
	}

}
