package linkedList.questions;

public class Leetcode_1721_SwapNodes {

    private ListNode swapNodes(ListNode head, int k) {
        int len = findLength(head);

        ListNode leftNode = head;
        for (int i = 0; i < k - 1; i++) {
            leftNode = leftNode.next;
        }

        ListNode rightNode = head;
        for (int i = 0; i < len - k; i++) {
            rightNode = rightNode.next;
        }
        int temp = leftNode.val;
        leftNode.val = rightNode.val;
        rightNode.val = temp;

        return head;

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
