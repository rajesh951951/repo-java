package main.java.dataStructures.linkedList.singly;

public class MergeSortedList {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.createSinglyLinkedList(1);
        list1.insertInLinkedList(2,1);
        list1.insertInLinkedList(3,2);
        //list1.traverseSinlglLinkeList();

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.createSinglyLinkedList(1);
        list2.insertInLinkedList(3,1);
        list2.insertInLinkedList(4,2);
        //list2.traverseSinlglLinkeList();

        SinglyLinkedList mergedList = mergeSortedList(list1, list2);
        System.out.print("Merged List :: ");
        mergedList.traverseSinlglLinkeList();

        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.createSinglyLinkedList(1);

        SinglyLinkedList list4 = new SinglyLinkedList();

        SinglyLinkedList mergedList1 = mergeSortedList(list3, list4);
        System.out.print("Merged List :: ");
        mergedList1.traverseSinlglLinkeList();
    }

    private static SinglyLinkedList mergeSortedList(SinglyLinkedList list1, SinglyLinkedList list2) {
        SinglyLinkedList mergedList = new SinglyLinkedList();
        Node tempOne = list1.head;
        Node tempTwo = list2.head;

        if(tempOne != null || tempTwo != null){
            Node currentNode = tempOne;
            mergedList.head = currentNode;
            mergedList.tail = currentNode;

            while(tempOne != null){
                    currentNode = tempOne;
                    tempOne = tempOne.next;
                    mergedList.insertInLinkedList(currentNode.value, list1.size);
            }
            while(tempTwo != null){
                currentNode = tempTwo;
                tempTwo = tempTwo.next;
                mergedList.insertInLinkedList(currentNode.value, list2.size);
            }
        }

        if(mergedList.size > 0){
            Node currentNode = mergedList.head;
            Node nextNode = currentNode.next;
            while(currentNode.next!=null){
                if(currentNode.value > nextNode.value){
                    Node temp = currentNode;
                    currentNode = nextNode;
                    nextNode = temp;
                }
                currentNode = currentNode.next;
            }
            //mergedList.traverseSinlglLinkeList();
        }

        return mergedList;
    }
}
