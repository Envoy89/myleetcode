package algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(int inputValue, int expectedValue) {
        int actualValue = ReverseInteger.reverse(inputValue);

        assertEquals(expectedValue, actualValue);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(1534236469, 0),
                Arguments.of(1, 1),
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21),
                Arguments.of(0, 0)
        );
    }
}