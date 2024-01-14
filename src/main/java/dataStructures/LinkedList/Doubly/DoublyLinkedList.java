package main.java.dataStructures.LinkedList.Doubly;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDoublyLinkedList(int nodeValue){
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInDoublyLinkedList(int nodeVaule, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeVaule;
        if(head == null){ //no element in Linked List
            createDoublyLinkedList(nodeVaule);
        }else if(location == 0){ //insert at beginning
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if(location >=size){
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }else{
            DoublyNode tempNode = new DoublyNode();
            for(int i = 0; i < location-1; i++){
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            newNode.next.prev = newNode;
            tempNode.next = newNode;
        }
        size++;
    }
}
