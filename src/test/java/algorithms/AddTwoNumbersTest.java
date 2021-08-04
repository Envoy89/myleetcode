package algorithms;

import lombok.AllArgsConstructor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(TestCase testCase) {
        AddTwoNumbers.ListNode actualResult = AddTwoNumbers.addTwoNumbers(testCase.l1, testCase.l2);
        AddTwoNumbers.ListNode expectedResult = testCase.result;

        while (actualResult != null || expectedResult != null) {
            assertNotNull(actualResult);
            assertNotNull(expectedResult);
            assertEquals(actualResult.val, expectedResult.val);

            actualResult = actualResult.next;
            expectedResult = expectedResult.next;
        }
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

    private static AddTwoNumbers.ListNode generateListNodeFromArray(int[] nums) {
        AddTwoNumbers.ListNode listNode = new AddTwoNumbers.ListNode();
        AddTwoNumbers.ListNode intermediateNode = listNode;

        for (int i = 0; i < nums.length; i++) {
            intermediateNode.val = nums[i];

            if (i < nums.length - 1) {
                AddTwoNumbers.ListNode nextListNode = new AddTwoNumbers.ListNode();
                intermediateNode.next = nextListNode;

                intermediateNode = nextListNode;
            }
        }

        return listNode;
    }

    @AllArgsConstructor
    private static class TestCase {
        AddTwoNumbers.ListNode l1;
        AddTwoNumbers.ListNode l2;
        AddTwoNumbers.ListNode result;
    }
}