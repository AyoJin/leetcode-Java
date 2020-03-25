package com.leetcoode.problems;

import com.leetcoode.model.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode cur = head;
        ListNode nxt = head;
        while (cur.next != null && nxt.next != null && nxt.next.next != null ) {
            if (nxt.next == cur || nxt.next.next == cur) {
                return true;
            }
            cur = cur.next;
            nxt = nxt.next.next;
        }
        return false;
    }
}
