package main.java.dataStructures.linkedList.singly;

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

        System.out.println();
        singlyLinkedList.searchValue(20);
        singlyLinkedList.searchValue(10);
        singlyLinkedList.searchValue(40);

        singlyLinkedList.traverseSinlglLinkeList();
        //singlyLinkedList.deleteNode(2);
        singlyLinkedList.traverseSinlglLinkeList();

        //singlyLinkedList.deleteAllNodes();
        singlyLinkedList.traverseSinlglLinkeList();

        System.out.println();
        singlyLinkedList.reverseTraverseSinlglLinkeList();
    }
}
