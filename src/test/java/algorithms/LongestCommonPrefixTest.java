package algorithms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(TestCase testCase) {
        String actualPrefix = LongestCommonPrefix.longestCommonPrefix(testCase.getStrs());

        assertEquals(testCase.getPrefix(), actualPrefix);
    }

    private static TestCase[] testCases() {
        return new TestCase[] {
                new TestCase(
                        new String[] {"flower","flow","flight"},
                        "fl"
                ),
                new TestCase(
                        new String[] {"dog","racecar","car"},
                        ""
                ),
                new TestCase(
                        new String[] {""},
                        ""
                )
        };
    }

    @AllArgsConstructor
    @Getter
    private static class TestCase {
        String[] strs;
        String prefix;
    }
}