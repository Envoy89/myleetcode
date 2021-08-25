package algorithms;

import algorithms.entity.ListNode;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;

        boolean isOriginalListsNotNull = l1 != null || l2 != null;

        ListNode node;

        while(l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                int minVal = Math.min(l1.val, l2.val);

                current.val = minVal;

                if (minVal == l1.val) {
                    l1 = l1.next;
                } else if (minVal == l2.val) {
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                int minVal = l1.val;
                current.val = minVal;
                l1 = l1.next;
            } else if (l2 != null) {
                int minVal = l2.val;
                current.val = minVal;
                l2 = l2.next;
            }

            if (l1 != null || l2 != null) {
                node = new ListNode();
                current.next = node;
                current = node;
            }
        }

        return isOriginalListsNotNull ? result : null;
    }
}
