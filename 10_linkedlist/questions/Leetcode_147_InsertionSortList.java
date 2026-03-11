package linkedList.questions;

public class Leetcode_147_InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = head;

        while(cur != null && cur.next != null){
            if(cur.val <= cur.next.val){
                cur = cur.next;
            } else {
                ListNode toInsert = cur.next;
                cur.next = toInsert.next;
                ListNode prev = dummy;
                while(prev.next.val <= toInsert.val){
                    prev = prev.next;
                }
                toInsert.next = prev.next;
                prev.next = toInsert;
            }
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
