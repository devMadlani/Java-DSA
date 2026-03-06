package linkedList;


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

    public void insertRec(int val, int index){
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

    public  void removeDuplicates(){
        Node node = head;
        while(node.next != null){
            if(node.data == node.next.data){
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
    public static SingleLinkedList merge(SingleLinkedList first, SingleLinkedList second){
        Node f = first.head;
        Node s = second.head;
        SingleLinkedList ans = new SingleLinkedList();
        while(f != null && s != null){
            if(f.data < s.data){
                ans.insertLast(f.data);
                f = f.next;
            } else {
                ans.insertLast(s.data);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.data);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.data);
            s = s.next;
        }

        return ans;
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

    public static void main() {

        // q-3
        SingleLinkedList list1 = new SingleLinkedList();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);
        list1.insertLast(6);
        SingleLinkedList list2 = new SingleLinkedList();
        list2.insertLast(4);
        list2.insertLast(7);
        list2.insertLast(9);
        list2.insertLast(12);
        SingleLinkedList ans = SingleLinkedList.merge(list1, list2);
        ans.display();
    }
}
