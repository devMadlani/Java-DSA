package linkedList.questions;

public class Leetcode_2095_DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return head.next;
        }
        ListNode s = head;
        ListNode f = head;
        ListNode headprev = null;
        while(f != null && f.next != null){
            headprev = s;
            s = s.next;
            f = f.next.next;
        }
        headprev.next = s.next;
        return head;
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
