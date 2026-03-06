package linkedList.questions;

public class Q_FindCycleLength {
    public int findCycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                int length = 0;
                do {
                    length += 1;
                    temp = temp.next;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }
}
