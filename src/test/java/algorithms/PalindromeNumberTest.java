package algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(int input, boolean expectedResult) {
        boolean actualResult = PalindromeNumber.isPalindrome(input);

        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false),
                Arguments.of(-101, false),
                Arguments.of(123454321, true),
                Arguments.of(0, true)
        );
    }
}