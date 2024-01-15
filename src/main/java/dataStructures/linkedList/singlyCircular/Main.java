package main.java.dataStructures.linkedList.singlyCircular;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        Node node = circularSinglyLinkedList.createCircularSinglyLinkedList(10);
        circularSinglyLinkedList.insertInCircularSinglyLinkedList(12,1);
        circularSinglyLinkedList.insertInCircularSinglyLinkedList(11,2);
        circularSinglyLinkedList.insertInCircularSinglyLinkedList(13,1);

        //System.out.println(node.value);
        //System.out.println(node.next.value);
        //System.out.println(node.next.next.value);
        //System.out.println(node.next.next.next.value);

        circularSinglyLinkedList.traverseCinrcularSinglyLinkedList();

        //circularSinglyLinkedList.searchElementCircularLinkedList(13);
        //circularSinglyLinkedList.searchElementCircularLinkedList(15);

        circularSinglyLinkedList.deleteNodeCicularSInglyLinkedList(8);
        circularSinglyLinkedList.traverseCinrcularSinglyLinkedList();

        circularSinglyLinkedList.deleteAllNodes();
        circularSinglyLinkedList.traverseCinrcularSinglyLinkedList();
    }
}
