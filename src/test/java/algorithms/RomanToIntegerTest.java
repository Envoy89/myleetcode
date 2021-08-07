package algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(String input, int expectedResult) {
        int actualResult = RomanToInteger.romanToInt(input);

        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("DCXXI", 621),
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("MX", 1010)
        );
    }
}