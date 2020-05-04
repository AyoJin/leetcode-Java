package com.leetcoode.problems;

import com.leetcoode.model.ListNode;

public class IntersectionOfTwoLinkedLists {
    // 双指针 A + B = B + A
    // 两个指针必须同时移动
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
