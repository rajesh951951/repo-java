package main.java.dataStructures.LinkedList.Doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createDoublyLinkedList(10);
        //System.out.println(doublyLinkedList.head.value);
        //System.out.println(doublyLinkedList.tail.value);

        doublyLinkedList.insertInDoublyLinkedList(15,2);
        //System.out.println(doublyLinkedList.head.value);
        //System.out.println(doublyLinkedList.tail.value);
        doublyLinkedList.insertInDoublyLinkedList(3,2);
        doublyLinkedList.insertInDoublyLinkedList(5,3);
        //System.out.println(doublyLinkedList.head.value);
        //System.out.println(doublyLinkedList.tail.value);

        doublyLinkedList.traverseDoublyLinkedlist();
        doublyLinkedList.searchDoublyLinkedList(15);

        doublyLinkedList.revereseTraverseDLL();
        doublyLinkedList.searchReverseDoublyLinkedList(3);
    }
}
