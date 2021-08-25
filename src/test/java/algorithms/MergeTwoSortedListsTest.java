package algorithms;

import lombok.AllArgsConstructor;

import static algorithms.Utils.assertTwoList;
import static algorithms.Utils.generateListNodeFromArray;
import static org.junit.jupiter.api.Assertions.*;

import algorithms.entity.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MergeTwoSortedListsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(TestCase testCase) {
        ListNode actualResult = MergeTwoSortedLists.mergeTwoLists(testCase.l1, testCase.l2);
        ListNode expectedResult = testCase.result;

        assertTwoList(actualResult, expectedResult);
    }

    private static TestCase[] testCases() {
        return new TestCase[] {
                new TestCase(
                        generateListNodeFromArray(new int[] { 1,2,4 }),
                        generateListNodeFromArray(new int[] { 1,3,4 }),
                        generateListNodeFromArray(new int[] { 1,1,2,3,4,4 })
                ),
                new TestCase(
                        null,
                        null,
                        null
                ),
                new TestCase(
                        null,
                        generateListNodeFromArray(new int[] { 0 }),
                        generateListNodeFromArray(new int[] { 0 })
                ),
        };
    }

    @AllArgsConstructor
    private static class TestCase {
        ListNode l1;
        ListNode l2;
        ListNode result;
    }
}