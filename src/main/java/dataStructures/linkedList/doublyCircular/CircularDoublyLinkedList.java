package main.java.dataStructures.linkedList.doublyCircular;

public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    int size;

    public DoublyNode createCircularDoublyLinkedList(int nodeValue){
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    public void insertInCircularDoublyLinkedList(int nodeValue, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(head==null){
            createCircularDoublyLinkedList(nodeValue);
        }else{
            if(location == 0){
                newNode.prev = tail;
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
                tail.next = newNode;
            }else if(location >= size){
                newNode.next = head;
                newNode.prev = tail;
                tail.next = newNode;
                head.prev = newNode;
                tail = newNode;
            }else{
                DoublyNode tempNode = new DoublyNode();
                tempNode = head;
                for(int i = 0; i< location-1; i++){
                    tempNode = tempNode.next;
                }
                newNode.prev = tempNode;
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                newNode.next.prev = newNode;
            }
            size++;
        }
    }

    public void traverseCDLL(){
        if(head==null){
            System.out.println("CDLL does not exists.");
        }else{
            DoublyNode tempNode = head;
            for(int i = 0; i< size; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    public void reverseTraverseCDLL(){
        if(head==null){
            System.out.println("CDLL does not exists.");
        }else{
            DoublyNode tempNode = tail;
            for(int i = 0; i< size; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        }
        System.out.println();
    }

    public boolean searchInCDLL(int value){
        if(head==null){
            System.out.println("CDLL does not exists.");
        }else{
            DoublyNode tempNode = head;
            for(int i =0; i < size; i++){
                if(tempNode.value == value){
                    System.out.println("Node found at index "+i+" for value "+value);
                    return true;
                }
                tempNode = tempNode.next;
            }
            System.out.println("Node Not found for value "+value);
        }
        return false;
    }

    public void deleteNodeCDLL(int location){
        if(head==null){

        }else{

            if(location == 0){
                if(size == 1){
                    head.prev = null;
                    head.next = null;
                    head = tail = null;
                    size--;
                }else{
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                    size--;
                }
            }else if(location >= size){
                if(size == 1){
                    head.prev = null;
                    head.next = null;
                    head = tail = null;
                    size--;
                }else{
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                    size--;
                }
            }else{
                DoublyNode tempNode = head;
                for(int i =0 ; i < location-1; i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                tempNode.prev.next = tempNode;
                size--;
            }
        }
    }

    public void deleteAllNodesCDLL(){
        DoublyNode tempNode = head;
        for(int i = 0 ; i< size; i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
    }
}
