package linkedList.questions;

import linkedList.SingleLinkedList;

public class Leetcode_234_isPalindrome {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        System.out.println(list.isPalindrome());
    }
}
