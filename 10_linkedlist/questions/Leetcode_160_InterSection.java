package linkedList.questions;

public class Leetcode_160_InterSection {

    private ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = findLength(headA);
        int lenB = findLength(headB);
        // ListNode headA = headA;
        // ListNode headB = headB;
        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }
        while (lenB > lenA) {
            lenB--;
            headB = headB.next;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int findLength(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
