package algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(String input, int expectedLength) {
        int resultLength = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        assertEquals(expectedLength, resultLength);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("", 0),
                Arguments.of(" ", 1),
                Arguments.of("dvdf", 3),
                Arguments.of("asjrgapa", 6)
        );
    }
}