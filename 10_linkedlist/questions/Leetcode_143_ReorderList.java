package linkedList.questions;

import linkedList.SingleLinkedList;

public class Leetcode_143_ReorderList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        list.display();
        list.reorderList();
        list.display();
    }
}
