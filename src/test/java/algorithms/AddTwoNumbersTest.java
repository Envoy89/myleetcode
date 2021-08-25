package algorithms;

import lombok.AllArgsConstructor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static algorithms.Utils.assertTwoList;
import static algorithms.Utils.generateListNodeFromArray;
import static org.junit.jupiter.api.Assertions.*;

import algorithms.entity.ListNode;

class AddTwoNumbersTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(TestCase testCase) {
        ListNode actualResult = AddTwoNumbers.addTwoNumbers(testCase.l1, testCase.l2);
        ListNode expectedResult = testCase.result;

        assertTwoList(actualResult, expectedResult);
    }

    private static TestCase[] testCases() {
        return new TestCase[] {
                new TestCase(
                        generateListNodeFromArray(new int[] { 2,4,3 }),
                        generateListNodeFromArray(new int[] { 5,6,4 }),
                        generateListNodeFromArray(new int[] { 7,0,8 })
                ),
                new TestCase(
                        generateListNodeFromArray(new int[] { 9 }),
                        generateListNodeFromArray(new int[] { 9 }),
                        generateListNodeFromArray(new int[] { 8, 1 })
                ),
                new TestCase(
                        generateListNodeFromArray(new int[] { 0 }),
                        generateListNodeFromArray(new int[] { 0 }),
                        generateListNodeFromArray(new int[] { 0 })
                ),
                new TestCase(
                        generateListNodeFromArray(new int[] { 9,9,9 }),
                        generateListNodeFromArray(new int[] { 9,9,9 }),
                        generateListNodeFromArray(new int[] { 8,9,9,1 })
                )
        };
    }

    @AllArgsConstructor
    private static class TestCase {
        ListNode l1;
        ListNode l2;
        ListNode result;
    }
}