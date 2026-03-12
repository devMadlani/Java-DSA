package linkedList.questions;

public class Leetcode_2074_ReverseNodeEvenLengthGroup {
    public ListNode reverseEvenLengthGroups(ListNode head){
        ListNode cur = head;
        int gn = 0, elementOfLastGroup = 0;
        ListNode lastNodeOfPrevGroup = null, lastofEvenGroup = null;

        while(cur != null){
            gn++;
            if(gn % 2 == 0){
                elementOfLastGroup = rev(lastNodeOfPrevGroup, cur, gn);
                lastofEvenGroup = cur;
                cur = cur.next;
            } else {
                int k = gn;
                elementOfLastGroup = 0;
                while(cur != null && k > 0){
                    lastNodeOfPrevGroup = cur;
                    cur = cur.next;
                    k--;
                    elementOfLastGroup++;
                }
            }
        }
        if(gn % 2 == 1 && elementOfLastGroup % 2 == 0){
            rev(lastofEvenGroup, lastofEvenGroup.next, elementOfLastGroup);
        } else if(gn % 2 == 0 && elementOfLastGroup % 2 == 1){
            rev(lastNodeOfPrevGroup, lastNodeOfPrevGroup.next, elementOfLastGroup);
        }
        return head;
    }

    private int rev(ListNode last, ListNode headOfGroup, int n) {
        ListNode prev = null;
        ListNode cur = headOfGroup;
        ListNode next = cur.next;
        int count = 0;
        while(cur != null && n > 0){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            n--;
            count++;
        }
        headOfGroup.next = next;
        last.next = prev;
        return count;
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
