package algorithms;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode intermediateNode = result;

        int additionalVal = 0;
        while ((l1 == null && l2 == null && additionalVal != 0) || l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int resVal;

            resVal = val1 + val2 + additionalVal;

            if (resVal > 9) {
                resVal = resVal % 10;
                additionalVal = 1;
            } else {
                additionalVal = 0;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            intermediateNode.val = resVal;
            if ((l1 == null && l2 == null && additionalVal != 0) || l1 != null || l2 != null) {
                ListNode nextNode = new ListNode();
                intermediateNode.next = nextNode;
                intermediateNode = nextNode;
            }
        }

        return result;
    }

    public static class ListNode {
      int val;
      ListNode next;

      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
