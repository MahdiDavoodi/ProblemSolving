# Add Two Numbers

✅ Try to solve [this](https://leetcode.com/problems/add-two-numbers/) problem by yourself before checking answers.

## Problem

-> Check the problem with more explanation on LeetCode.com

> You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
>
> You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Solution

The best answer is the one that is currently available in this directory. You can also see some of my previous iterations and attempts to solve this problem.

### Iteration 1 - My first attempt

```java
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
```

☀️ Result:

> Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
>
> Memory Usage: 39.2 MB, less than 81.19% of Java online submissions for Add Two Numbers.
