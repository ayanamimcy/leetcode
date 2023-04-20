package com.ayanamimcy.leetcode._23;

import com.ayanamimcy.leetcode.common.ListNode;

/**
 * 
 
// simple solution: append the list in to ar list and use the native java sort api 
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
		List<Integer> result = new ArrayList<>();

        for (int i = 0; i<lists.length; i++) {
            ListNode node = lists[i];
            while (node != null) {
                result.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(result);

        ListNode head = new ListNode();
        ListNode ans = head;    
        for (int i = 0;i < result.size(); i++) {
            head.next = new ListNode(result.get(i));
            head = head.next;
        }
        return ans.next;
    }  
}
*/

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }
		return mergeHepler(lists, 0, lists.length - 1);
    }

    private ListNode mergeHepler(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }

        if (start + 1 == end) {
            return merge(lists[start], lists[end]);
        }

        int mid = (start + end) / 2;
        ListNode l1 = mergeHepler(lists, start, mid);
        ListNode l2 = mergeHepler(lists, mid + 1, end);

        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l1.next = merge(l1.next, l2);
                return l1;
            } else {
                l2.next = merge(l1, l2.next);
                return l2;
            }
        }

        if (l1 == null) {
            return l2;
        }
        return l1;
    }
}