package main.java.dataStructures.LinkedList.DoublyCircular;

import main.java.dataStructures.LinkedList.SinglyCircular.CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        circularDoublyLinkedList.createCircularDoublyLinkedList(10);
        circularDoublyLinkedList.insertInCircularDoublyLinkedList(15,0);
        circularDoublyLinkedList.insertInCircularDoublyLinkedList(16,0);
        circularDoublyLinkedList.insertInCircularDoublyLinkedList(21,3);
        circularDoublyLinkedList.insertInCircularDoublyLinkedList(42,2);

        /*System.out.println(circularDoublyLinkedList.head.value);
        System.out.println(circularDoublyLinkedList.head.next.value);
        System.out.println(circularDoublyLinkedList.head.prev.value);
        System.out.println(circularDoublyLinkedList.tail.value);
        System.out.println(circularDoublyLinkedList.tail.next.value);
        System.out.println(circularDoublyLinkedList.tail.prev.value);*/

        circularDoublyLinkedList.traverseCDLL();
        //circularDoublyLinkedList.reverseTraverseCDLL();

        //circularDoublyLinkedList.searchInCDLL(42);
        //circularDoublyLinkedList.searchInCDLL(15);
        //circularDoublyLinkedList.searchInCDLL(50);

        circularDoublyLinkedList.deleteNodeCDLL(2);
        circularDoublyLinkedList.traverseCDLL();
        circularDoublyLinkedList.deleteAllNodesCDLL();
        circularDoublyLinkedList.traverseCDLL();
    }

}
