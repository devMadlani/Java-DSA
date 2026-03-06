package linkedList;

public class DoublyLinkedList {
    Node head;


    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void insert(int data, int index) {
        if (index == 0) {
            insertFirst(data);
            return;
        }
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        Node newNode = new Node(data);
        newNode.prev = node;
        newNode.next = node.next;
        if (node.next != null) {
            node.next.prev = newNode;
        }
        node.next = newNode;
    }

    public int deleteFirst() {
        int data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return data;
    }

    public int deleteLast() {
        if (head.next == null) {
            deleteFirst();
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        int data = node.data;
        node.prev.next = null;
        return data;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public void display() {

        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }

        System.out.println();
        System.out.println("print in reverse");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }

    private class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }


    }
}
