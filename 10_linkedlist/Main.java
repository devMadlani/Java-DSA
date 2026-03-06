package linkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        // list.insertFirst(1);
        // list.insertFirst(1);
        // list.insertFirst(2);

        // Q-1
        // list.insertRec(10, 1);



        //----------------------------
        //  Q-2;
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(4);
        list.display();
        list.removeDuplicates();
        list.display();

//        DoublyLinkedList dlist = new DoublyLinkedList();
//        dlist.insertFirst(12);
//        dlist.insertFirst(13);
//        dlist.insertFirst(11);
//        dlist.insertLast(30);
//        dlist.insert(24, 4);
//        dlist.deleteFirst();
//        dlist.deleteLast();
//        dlist.display();
    }
}
