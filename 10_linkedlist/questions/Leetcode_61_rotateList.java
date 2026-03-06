package linkedList.questions;

import linkedList.SingleLinkedList;

public class Leetcode_61_rotateList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.rotateList(2);
        list.display();
    }
}
