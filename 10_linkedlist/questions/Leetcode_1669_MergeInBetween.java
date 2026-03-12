package linkedList.questions;

public class Leetcode_1669_MergeInBetween {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur = list1;
        int i = 0;
        while(i < a - 1){
            cur = cur.next;
            i++;
        }
        ListNode head = cur;
        while(i <= b){
            cur = cur.next;
            i++;
        }
        head.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = cur;
        return list1;
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
