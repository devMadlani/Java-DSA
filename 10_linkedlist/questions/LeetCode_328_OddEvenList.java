package linkedList.questions;

public class LeetCode_328_OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode leftHead = list1;
        ListNode rightHead = list2;
        ListNode cur = head;
        int i = 1;
        while(cur != null){
            if(i % 2 == 0){
                rightHead.next = cur;
                rightHead = rightHead.next;

            } else {
                leftHead.next = cur;
                leftHead = leftHead.next;
            }
            i++;
            cur = cur.next;

        }
        leftHead.next = list2.next;
        rightHead.next = null;
        return list1.next;
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
