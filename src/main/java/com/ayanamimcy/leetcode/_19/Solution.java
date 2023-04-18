package com.ayanamimcy.leetcode._19;

import com.ayanamimcy.leetcode.common.ListNode;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // n == ListNode.length
        if (fast == null) return head.next;

        // we neet to find the (n + 1)th node to delete the nth node, so we should test the fast.next == null not fast == null
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

}
