package main.java.dataStructures.LinkedList.SinglyCircular;

public class CircularSinglyLinkedList {
    Node head;
    Node tail;
    int size;
    public Node createCircularSinglyLinkedList(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = node; //In CircularSinglyLinkedList, set last node ref to first, as this is first node,set ref to self
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInCircularSinglyLinkedList(int nodeVaule, int location){
        //create node and assign nodeValue to it
        Node node = new Node();
        node.value = nodeVaule;
        if(head == null) {
            createCircularSinglyLinkedList(nodeVaule);
        }else if(location == 0){ // Insert at the beginning
            node.next = head;
            head = node;
            tail.next = node;
        }else if(location >= size){ // Insert at end
            node.next = tail.next; // node.next = head;
            tail.next = node;
            tail = node;
        }else{ // Insert at specified location
            Node tempNode = head;
            for(int i =0; i < location-1; i++){
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traverseCinrcularSinglyLinkedList(){
        if(head!=null){
            Node newNode = head;
            for(int i = 0; i < size ; i++){
                System.out.print(newNode.value);
                if(i != size-1)
                    System.out.print("->");
                newNode = newNode.next;
            }
            System.out.println();
        }else{
            System.out.println("Empty LinkedList.");
        }
    }

    public boolean searchElementCircularLinkedList(int nodeValue){
        if(head != null){
            Node newNode = head;
            for(int i = 0 ; i < size; i++){
                if(newNode.value == nodeValue){
                    System.out.println("Node found at index "+ i + " for value "+nodeValue);
                    return true;
                }
                newNode = newNode.next;
            }
        }
        System.out.println("Node not found for "+nodeValue);
        return false;
    }

    public void deleteNodeCicularSInglyLinkedList(int location){
        if(head != null){
            if(location == 0){
                head = head.next;
                tail.next = head;
                size--;
                if(size == 0){
                    head.next = null;
                    tail = null;
                    head = null;
                }
            }
            else if(location >= size){
                Node tempNode = head;
                for(int i = 0 ; i < size-1; i++) {
                    tempNode = tempNode.next;
                }
                if(tempNode == head){
                    head.next = null;
                    head = null;
                    size--;
                }
                tempNode.next = head;
                tail = tempNode;
                size--;
            }else {
                Node tempNode = head;
                for (int i = 0; i < location - 1; i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                size--;
                return;
            }
        }else {
            System.out.println("Linked List Does not exists;");
        }
    }

    public void deleteAllNodes(){
        if(head == null){
            System.out.println("Linked List Does not exits;");
        }else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("Circular Singly Linked List Deleted Successfully.");
        }
    }
}
