package linkedList.questions;

public class Leetcode_24_SwapPairs {
     ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode node = dummy;

        while(node != null){
            ListNode first = node.next;
            ListNode sec = null;
            if(first != null){
                sec = first.next;
            }
            if(sec != null){
                ListNode secNext = sec.next;
                sec.next = first;
                node.next = sec;
                first.next = secNext;
                node = first;
            } else {
                break;
            }
        }
        // swap(dummy);
        return dummy.next;
    }

    // recursion
    // void swap(ListNode node){
    //     if(node == null) return;

    //     ListNode first = node.next;
    //     ListNode sec = null;
    //     if(first != null){
    //         sec = first.next;
    //     }

    //     if(sec != null){
    //         ListNode secNext = sec.next;
    //         sec.next = first;
    //         node.next = sec;
    //         first.next = secNext;
    //         swap(first);
    //     }
    // }

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
