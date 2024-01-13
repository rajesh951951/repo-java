package main.java.dataStructures.LinkedList.Singly;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        Node node = singlyLinkedList.createSinglyLinkedList(10);
        //singlyLinkedList.printLinkedList(node);
        singlyLinkedList.traverseSinlglLinkeList();

        singlyLinkedList.insertInLinkedList(5,0);
        singlyLinkedList.traverseSinlglLinkeList();

        singlyLinkedList.insertInLinkedList(50,3);
        singlyLinkedList.traverseSinlglLinkeList();
        //singlyLinkedList.printLinkedList(node);

        singlyLinkedList.insertInLinkedList(20,1);
        singlyLinkedList.traverseSinlglLinkeList();
        //singlyLinkedList.printLinkedList(node);

        singlyLinkedList.insertInLinkedList(30,2);
        singlyLinkedList.traverseSinlglLinkeList();
        //singlyLinkedList.printLinkedList(node);
    }
}
