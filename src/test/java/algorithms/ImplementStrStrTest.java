package algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(String haystack, String needle, int expectedResult) {
        int actualResult = ImplementStrStr.strStr(haystack, needle);

        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("", "", 0),
                Arguments.of("hello", "ll", 2),
                Arguments.of("aaaaa", "bba", -1),
                Arguments.of("aaa", "aaaa", -1),
                Arguments.of("mississippi", "issip", 4),
                Arguments.of("aabaaabaaac", "aabaaac", 4),
                Arguments.of("aaaaaaaaaab", "aaab", 7)
        );
    }

}