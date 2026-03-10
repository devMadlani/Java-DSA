package linkedList.questions;

public class Leetcode_1290_CovertBinaryToDecimal {

    //      Definition for singly-linked list.
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

    private class Solution {
        public int getDecimalValue(ListNode head) {
            ListNode temp = head;
            int n = 0;
            while (temp != null) {
                n *= 2;
                n += temp.val;
                temp = temp.next;
            }

            return n;
        }
    }
}
