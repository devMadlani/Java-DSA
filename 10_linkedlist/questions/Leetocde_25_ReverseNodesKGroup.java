package linkedList.questions;

import linkedList.SingleLinkedList;

public class Leetocde_25_ReverseNodesKGroup {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.reverseKGroup(3);
        list.display();
    }
}
