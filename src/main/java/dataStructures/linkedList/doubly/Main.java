package main.java.dataStructures.linkedList.doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createDoublyLinkedList(10);//insert first element
        //System.out.println(doublyLinkedList.head.value);
        //System.out.println(doublyLinkedList.tail.value);

        doublyLinkedList.insertInDoublyLinkedList(15,2);//insert in between
        //System.out.println(doublyLinkedList.head.value);
        //System.out.println(doublyLinkedList.tail.value);
        doublyLinkedList.insertInDoublyLinkedList(3,2);//insert in between
        doublyLinkedList.insertInDoublyLinkedList(5,3);//insert at last
        //System.out.println(doublyLinkedList.head.value);
        //System.out.println(doublyLinkedList.tail.value);

        //doublyLinkedList.searchDoublyLinkedList(15);//search

        //doublyLinkedList.revereseTraverseDLL();//traverseRev
        doublyLinkedList.traverseDoublyLinkedlist();

        //doublyLinkedList.searchReverseDoublyLinkedList(3);//searchReverse
        //doublyLinkedList.deleteNodeDoublyLinkedList(1);//delete
        doublyLinkedList.deleteAllNodesDLL();
        doublyLinkedList.traverseDoublyLinkedlist();
    }
}
