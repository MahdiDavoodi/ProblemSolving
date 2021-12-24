class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(), next = result, node1 = l1, node2 = l2;
        int temp = 0;
        while (node1 != null || node2 != null) {
            int x = 0, y = 0;
            if (node1 != null)
                x = node1.val;
            if (node2 != null)
                y = node2.val;
            temp += x + y;
            if (temp >= 10) {
                next.val = temp % 10;
                temp = 1;
            } else {
                next.val = temp;
                temp = 0;
            }
            if (node1 != null)
                node1 = node1.next;
            if (node2 != null)
                node2 = node2.next;

            if (node1 != null || node2 != null) {
                next.next = new ListNode();
                next = next.next;
            }
        }
        if (temp == 1)  next.next = new ListNode(1);
        return result;
    }
}