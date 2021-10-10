package algorithms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(TestCase testCase) {
        int actualValue = SearchInsertPosition.searchInsert(testCase.getNums(), testCase.getTarget());

        assertEquals(testCase.getExpectedValue(), actualValue);
    }

    private static TestCase[] testCases() {
        TestCase[] testCases = new TestCase[] {
                new TestCase(
                        new int[] { 1,2,3,4,5,10},
                        2,
                        1
                ),
                new TestCase(
                        new int[] { 1 },
                        1,
                        0
                ),
                new TestCase(
                        new int[] { 1, 2 },
                        2,
                        1
                ),
                new TestCase(
                        new int[] { 1, 2, 3 },
                        3,
                        2
                ),
                new TestCase(
                        new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                        6,
                        5
                ),
                new TestCase(
                        new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 10 },
                        8,
                        7
                ),
                new TestCase(
                        new int[] { 1,3,5 },
                        4,
                        2
                ),
                new TestCase(
                        new int[] { 1,3,5,6,7 },
                        5,
                        2
                ),
                new TestCase(
                        new int[] { 1,3,5,6,7 },
                        1,
                        0
                ),
                new TestCase(
                        new int[] { 1,3,5,6,7 },
                        7,
                        4
                ),
                new TestCase(
                        new int[] { 1,3,5,6,7 },
                        3,
                        1
                ),
                new TestCase(
                        new int[] { 1,3,5,6,7 },
                        6,
                        3
                ),
                new TestCase(
                        new int[] { 1,3,5,6,7 },
                        2,
                        1
                ),
                new TestCase(
                        new int[] {},
                        2,
                        0
                ),
                new TestCase(
                        new int[] { 1,3,6,7 },
                        1,
                        0
                ),
                new TestCase(
                        new int[] { 1,3,6,7 },
                        3,
                        1
                ),
                new TestCase(
                        new int[] { 1,3,6,7 },
                        6,
                        2
                ),
                new TestCase(
                        new int[] { 1,3,6,7 },
                        7,
                        3
                ),
                new TestCase(
                        new int[] { 1,3,6,7 },
                        2,
                        1
                ),
                new TestCase(
                        new int[] { 1,3,6,7 },
                        4,
                        2
                ),
                new TestCase(
                        new int[] { 1 },
                        2,
                        1
                ),
                new TestCase(
                        new int[] { 1 },
                        0,
                        0
                ),
                new TestCase(
                        new int[] { 1, 3 },
                        0,
                        0
                ),
                new TestCase(
                        new int[] { 1, 3 },
                        4,
                        2
                ),
                new TestCase(
                        new int[] { 1, 3 },
                        2,
                        1
                )
        };

        //return Arrays.stream(testCases).skip(15).limit(1).toArray(TestCase[]::new);
        return testCases;
    }

    @AllArgsConstructor
    @Getter
    private static class TestCase {
        private int[] nums;
        private int target;
        private int expectedValue;
    }
}