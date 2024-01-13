package main.java.dataStructures.LinkedList.Singly;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node node = singlyLinkedList.createSinglyLinkedList(10);
        System.out.println(node.value);
    }
}
