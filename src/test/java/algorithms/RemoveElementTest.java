package algorithms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(TestCase testCase) {
        int actualResultLength = RemoveElement.removeElement(testCase.getNums(), testCase.getVal());

        assertEquals(testCase.getExpectedResult().length, actualResultLength);

        int[] sortedArr = Arrays.copyOfRange(testCase.getNums(), 0, actualResultLength);

        Arrays.sort(sortedArr);
        Arrays.sort(testCase.getExpectedResult());

        for (int i = 0; i < testCase.getExpectedResult().length; i++) {
            assertEquals(sortedArr[i], testCase.getExpectedResult()[i]);
        }
    }

    private static TestCase[] testCases() {
        return new TestCase[] {
                new TestCase(
                        new int[] { 3,2,2,3 },
                        3,
                        new int[] { 2,2 }
                ),
                new TestCase(
                        new int[] { 0,1,2,2,3,0,4,2 },
                        2,
                        new int[] { 0,1,4,0,3 }
                ),
                new TestCase(
                        new int[] {},
                        2,
                        new int[] {}
                ),
                new TestCase(
                        new int[] { 0 },
                        2,
                        new int[] { 0 }
                ),
                new TestCase(
                        new int[] { 0 },
                        0,
                        new int[] {}
                )
        };
    }

    @AllArgsConstructor
    @Getter
    private static class TestCase {
        private int[] nums;
        private int val;
        private int[] expectedResult;
    }
}