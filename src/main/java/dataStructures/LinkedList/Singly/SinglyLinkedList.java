package main.java.dataStructures.LinkedList.Singly;

public class SinglyLinkedList {
    public  Node head;
    public  Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null){ // Insert when LinkedList is empty
            createSinglyLinkedList(nodeValue);
        }
        else if(location == 0) { // Inserting at the beginning of LinkedList
            node.next = head;
            head = node;
        } else if(location >= size){ // Inserting at the end of LinkedList
            node.next = null;
            tail.next = node;
            tail = node;
        } else{ // Inserting at the Specified location of SinglyLinkedList i.e. in-between LinkedList
            Node refNode = head;
            int searchIndex = 0;
            while(searchIndex < location - 1){ //traverse till we get specified location
                refNode = refNode.next;
                searchIndex++;
            }
            Node nextNode = refNode.next;
            refNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void printLinkedList(Node node){
        while (node != null && node.next != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }

        if (node != null) {
            System.out.println(node.value);
        } else {
            System.out.println("Empty LinkedList");
        }
    }

    public void traverseSinlglLinkeList(){
        if(head == null){
            System.out.println("Empty List");
        }else{
            Node newNode = head;
            for(int i = 0; i < size; i++){
                System.out.print(newNode.value);
                if(i != size-1){
                    System.out.print("->");
                }
                newNode = newNode.next;
            }
            System.out.println();
        }

    }


}
