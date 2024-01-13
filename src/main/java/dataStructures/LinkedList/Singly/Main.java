package main.java.dataStructures.LinkedList.Singly;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        Node node = singlyLinkedList.createSinglyLinkedList(10);
        singlyLinkedList.printLinkedList(node);
        System.out.println(node.value);

        //singlyLinkedList.insertInLinkedList(5,0); //ToDo: TBD - Check and correct for this use case
        //singlyLinkedList.printLinkedList(node);
        //System.out.println(node.value+"->"+node.next.value);

        singlyLinkedList.insertInLinkedList(50,3);
        singlyLinkedList.printLinkedList(node);
        //System.out.println(node.value+"->"+node.next.value);

        singlyLinkedList.insertInLinkedList(20,1);
        singlyLinkedList.printLinkedList(node);

        singlyLinkedList.insertInLinkedList(30,2);
        singlyLinkedList.printLinkedList(node);
    }
}
