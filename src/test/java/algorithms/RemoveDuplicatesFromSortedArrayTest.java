package algorithms;

import lombok.AllArgsConstructor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(TestCase testCase) {
        int actualK = RemoveDuplicatesFromSortedArray.removeDuplicates(testCase.inputNumbers);

        assertEquals(testCase.k, actualK);

        for (int i = 0; i < actualK; i++) {
            assertEquals(testCase.expectedNumbers[i], testCase.inputNumbers[i]);
        }
    }

    private static TestCase[] testCases() {
        return new TestCase[] {
                new TestCase(
                        new int[] { 1,1,2 },
                        new int[] { 1,2 },
                        2
                ),
                new TestCase(
                        new int[] { 0,0,1,1,1,2,2,3,3,4 },
                        new int[] { 0,1,2,3,4 },
                        5
                )
        };
    }

    @AllArgsConstructor
    private static class TestCase {
        int[] inputNumbers;
        int[] expectedNumbers;
        int k;
    }
}