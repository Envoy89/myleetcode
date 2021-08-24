package algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(String input, boolean expectedResult) {
        boolean actualResult = ValidParentheses.isValid(input);

        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("([)]", false),
                Arguments.of("{[]}", true),
                Arguments.of("(){}}{", false),
                Arguments.of("{[]}", true),
                Arguments.of("[([]])", false),
                Arguments.of("[", false)
        );
    }

}