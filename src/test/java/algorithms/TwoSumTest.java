package algorithms;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TwoSumTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(TestCase testCase) {
        int[] result = TwoSum.twoSum(testCase.nums, testCase.target);

        int resultSum = 0;
        for (int j : result) {
            resultSum += testCase.nums[j];
        }

        Assertions.assertEquals(testCase.target, resultSum);
    }

    private static TestCase[] testCases() {
        return new TestCase[] {
                new TestCase(new int[] { 2,7,11,15 }, 9),
                new TestCase(new int[] { 3,2,4 }, 6),
                new TestCase(new int[] { 3, 3 }, 6),

        };
    }

    @AllArgsConstructor
    private static class TestCase {
        int[] nums;
        int target;
    }
}
