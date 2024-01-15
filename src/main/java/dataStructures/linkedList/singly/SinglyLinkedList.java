package main.java.dataStructures.linkedList.singly;

import java.util.Arrays;

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

    public void reverseTraverseSinlglLinkeList(){
        if(head == null){
            System.out.println("Empty List");
        }else{
            int[] array = new int[size];
            Node tempNode = head;
            Node newNode = new Node();
            Node prevNode = new Node();
            while(tempNode != null){
                newNode = tempNode;
                tempNode = tempNode.next;

                newNode.next = prevNode;
                prevNode = newNode;
                head = newNode;
            }
            for(int i = 0; i < size; i++){
                System.out.print(prevNode.value);
                array[i] = prevNode.value;
                if(i != size-1){
                    System.out.print("<-");
                }
                prevNode = prevNode.next;
            }
            System.out.println();
            System.out.println(Arrays.toString(array));
        }
    }

    public boolean searchValue(int value){
        if(head != null){
          Node tempNode = head;
          for(int i = 0; i< size; i++){
              if(tempNode.value == value){
                  System.out.println("Node found for value "+value+" at Location "+i);
                  return true;
              }
              tempNode = tempNode.next;
          }
        }
        System.out.println("Node not found for value "+value);
        return false;
    }

    public void deleteNode(int location){
        // head null --> SLL does not exist
        if(head == null){
            System.out.println("Linked List does not exists.");
        }
        // location = 0, remove start element of list, when only one element, head, tail to null
        else if(location == 0){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        }
        // location >= size - remove element in last, traverse till 2nd last and set next null
        else if(location >= size){
            Node tempNode = head;
            for(int i = 0; i < size-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            size--;
        }
        // if location other than start, end, then traverse till node before required node, set next node as next of next
        else{
            Node tempNode = head;
            for(int i = 0; i < location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteAllNodes(){
        head = null;
        tail = null;
    }
}
