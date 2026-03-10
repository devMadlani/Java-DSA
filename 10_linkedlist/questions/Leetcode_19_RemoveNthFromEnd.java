package linkedList.questions;

public class Leetcode_19_RemoveNthFromEnd {

    private ListNode removeNthFromEnd(ListNode head, int n) {
        int len = findLength(head);
        if(len == n){
            return head.next;
        }
        ListNode temp = head;
        for(int i = 0; i < len - n - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
    private int findLength(ListNode head){
        int length = 0;
        ListNode temp  = head;
        while(temp != null){
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
