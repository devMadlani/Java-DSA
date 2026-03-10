package linkedList.questions;

public class Leetcode_203_RemoveElements {
    private ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        while(cur != null){
            if(cur.val == val){
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;

        }
        return dummy.next;
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
