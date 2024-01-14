package main.java.dataStructures.LinkedList.DoublyCircular;

public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    int size;

    public DoublyNode createCircularDoublyLinkedList(int nodeValue){
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }
}
