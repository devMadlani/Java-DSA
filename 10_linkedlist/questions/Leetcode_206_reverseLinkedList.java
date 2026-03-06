package linkedList.questions;

import linkedList.SingleLinkedList;

public class Leetcode_206_reverseLinkedList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        list.reverseIterative();
        list.display();
    }
}
