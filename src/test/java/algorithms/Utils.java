package algorithms;

import algorithms.entity.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Utils {
    public static ListNode generateListNodeFromArray(int[] nums) {
        ListNode listNode = new ListNode();
        ListNode intermediateNode = listNode;

        for (int i = 0; i < nums.length; i++) {
            intermediateNode.val = nums[i];

            if (i < nums.length - 1) {
                ListNode nextListNode = new ListNode();
                intermediateNode.next = nextListNode;

                intermediateNode = nextListNode;
            }
        }

        return listNode;
    }

    public static void assertTwoList(ListNode actualResult, ListNode expectedResult) {
        while (actualResult != null || expectedResult != null) {
            assertNotNull(actualResult);
            assertNotNull(expectedResult);
            assertEquals(actualResult.val, expectedResult.val);

            actualResult = actualResult.next;
            expectedResult = expectedResult.next;
        }
    }
}
