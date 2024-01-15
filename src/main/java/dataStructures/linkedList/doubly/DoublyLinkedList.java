package main.java.dataStructures.linkedList.doubly;

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

    public void traverseDoublyLinkedlist(){
        if(head!=null){
            DoublyNode tempNode = head;
            for(int i = 0; i< size; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }else{
            System.out.println("Doubly Linked List Does not exists.");
        }
        System.out.println();
    }

    public void revereseTraverseDLL(){
        if(head != null){
            DoublyNode tempNode = tail;
            for(int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if(i != size-1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        }else{
            System.out.println("Doubly Linked List Does not exists.");
        }
        System.out.println();
    }

    public boolean searchDoublyLinkedList(int value){
        if(head!=null){
            DoublyNode tempNode = head;
            for(int i = 0; i < size; i++){
                if(tempNode.value == value){
                    System.out.println("Element "+value+" found at index "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }else{
            System.out.println("Doubly Linked List Does not exists.");
            return false;
        }
        return false;
    }

    public boolean searchReverseDoublyLinkedList(int value){
        if(head!=null){
            DoublyNode tempNode = tail;
            for(int i = 0; i < size; i++){
                if(tempNode.value == value){
                    System.out.println("Element "+value+" found at index "+i+" in Reverse Traversal search.");
                    return true;
                }
                tempNode = tempNode.prev;
            }
        }else{
            System.out.println("Doubly Linked List Does not exists.");
            return false;
        }
        return false;
    }

    public void deleteNodeDoublyLinkedList(int location){
        //when only one node
        if(head == null){
            System.out.println();
        }else if(location == 0) { // delete beginning node
            if(size == 1){
                head = null;
                tail = null;
                size--;
            }else{
                head = head.next;
                head.prev = null;
                size--;
            }
        }else if(location >= size){ // delete at end
            DoublyNode tempNode = tail.prev;
            if(size == 1){
                head = null;
                tail = null;
                size--;
            }else{
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        }else{ //delete node at specified location
            DoublyNode tempNode = head;
            for(int i = 0; i < location -1 ; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    public void deleteAllNodesDLL(){
        DoublyNode tempNode = head;
        for(int i = 0; i < size; i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("DLL is deleted successfully.");
    }
}
