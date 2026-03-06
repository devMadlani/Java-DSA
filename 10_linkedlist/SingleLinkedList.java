package linkedList;


import linkedList.questions.Leetcode_148_sort_linkedlist;

import java.util.LinkedList;

public class SingleLinkedList {
    protected Node head;
    protected Node tail;
    protected int size;

    public SingleLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int data) {
        Node node = new Node(data); // [20 | null]
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int data) {
        Node node = new Node(data);
        if (tail == null) {
            insertFirst(data);
            return;
        }

        // it assigned new node's reference to that object whom the tail is referencing
        // for example tail is pointing to x123 object so tail.next = node means X123.next = newNode
        tail.next = node;
        // mow we assing new node refernce to the tail which is
        tail = node;
        size += 1;
    }

    public void insert(int value, int index) {
        if (head == null && tail == null) {
            System.out.println("Out of bound");
            return;
        }
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;


    }

    public int deleteFirst() {
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int data = tail.data;
        tail = secondLast;
        tail.next = null;
        return data;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int data = prev.next.data;
        prev.next = prev.next.next;
        return data;
    }

    public Node find(int data) {
        Node node = head;
        while (node != null) {
            if (node.data == data) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    //--------------------------------------------
    // Q-1
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    // --------------------------------------------
    // Q-2 remove duplicates (leetcode- 83)

    public void removeDuplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // --------------------------------------------
    // Q-3 merge sorted list (leetcode- 23)
    public static SingleLinkedList merge(SingleLinkedList first, SingleLinkedList second) {
        Node f = first.head;
        Node s = second.head;
        SingleLinkedList ans = new SingleLinkedList();
        while (f != null && s != null) {
            if (f.data < s.data) {
                ans.insertLast(f.data);
                f = f.next;
            } else {
                ans.insertLast(s.data);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.data);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.data);
            s = s.next;
        }

        return ans;
    }

    //  Q-9 sort list(bubble sort)
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    public void reverseRecursion() {
        reverseRecursion(head);
    }

    // Q-10 Reverse LinkedList
    // approach - 1
    private void reverseRecursion(Node node) {
        if (node == null) {
            head = tail;
            return;
        }

        reverseRecursion(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // aprroach - 2
    public void reverseIterative() {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    private Node reverseList(Node head) {
        if (size < 2) {
            return head;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    // Q-12

    public void reverseBetween() {
        reverseBetween(head, 2, 4);
    }

    private void reverseBetween(Node head, int left, int right) {
        if (right == left) {
            return;
        }

        Node prev = null;
        Node present = head;
        for (int i = 0; present != null && i < left - 1; i++) {
            prev = present;
            present = present.next;
        }

        Node last = prev;
        Node newEnd = present;
        Node next = present.next;
        for (int i = 0; present != null && i < right - left + 1; i++) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = present;
    }

    // Q-13 isPalindrome
    private Node middleNode(Node head) {
        Node s = head;
        Node f = head;
        while(f != null && f.next != null){
            s= s.next;
            f = f.next.next;
        }
        return s;
    }
    public boolean isPalindrome(){
        boolean ans = isPalindrome(head);
        return ans;
    }
    private boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid);

        Node tempHead = headSecond;
        while (head != null && headSecond != null) {
            if (head.data != headSecond.data) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(tempHead);
        return head == null || headSecond == null;
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);
            if (first.data > second.data) {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);

        }
        bubbleSort(row - 1, 0);
    }

    // Q-14 reorder list
    public void reorderList(){
        reorderList(head);
    }

    private void reorderList(Node head){
        Node mid = middleNode(head);
        Node hs = reverseList(mid);
        Node hf = head;

        while(hf != null && hs != null){
            //re - arrange
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null){
            hf.next = null;
        }
    }

    // Q-15 reverse k group

    public void reverseKGroup(int k){
         head = reverseKGroup(head,k);
        System.out.println(head.data);
    }
    private Node reverseKGroup(Node head, int k){
        if(k <= 1 || head == null){
            return head;
        }
        Node prev = null;
        Node current = head;
        while(true){
            Node temp = current;

            for (int i = 0; i < k; i++) {
                if (temp == null) {
                    return head;
                }
                temp = temp.next;
            }
            Node last = prev;
            Node newLast = current;

            Node next = current.next;
            for (int i = 0; current != null && i < k ; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            } else {
                head = prev;
            }
            newLast.next = current;
            if(current == null){
                break;
            }
            prev = newLast;
        }
        return head;
    }

    public void reverseAlternateKGroup(int k){
        head = reverseAlternateKGroup(head, k);
    }

    public Node reverseAlternateKGroup(Node head, int k){
        if(k <= 1 || head == null){
            return head;
        }
        Node prev = null;
        Node current = head;
        while(current != null){
            Node temp = current;

            for (int i = 0; i < k; i++) {
                if (temp == null) {
                    return head;
                }
                temp = temp.next;
            }
            Node last = prev;
            Node newLast = current;

            Node next = current.next;
            for (int i = 0; current != null && i < k ; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            } else {
                head = prev;
            }
            newLast.next = current;
            // skip k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public void rotateList(int k) {
        head = rotateList(head, k);
    }
    private Node rotateList(Node head, int k){
        if(head == null || head.next == null){
            return head;
        }
        Node node = head;
        int length = 1;
        while(node.next != null){
            node = node.next;
            length++;
        }
        node.next = head;
        int rotations = k % length;
        Node temp = head;
        for (int i = 0; i < length - rotations - 1; i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        // q-3
        SingleLinkedList list1 = new SingleLinkedList();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);
        list1.insertLast(6);
        SingleLinkedList list2 = new SingleLinkedList();
        list2.insertLast(7);
        list2.insertLast(4);
        list2.insertLast(12);
        list2.insertLast(9);
        list2.display();
        list2.bubbleSort();
        list2.display();
//        SingleLinkedList ans = SingleLinkedList.merge(list1, list2);

//        ans.display();
    }
}
