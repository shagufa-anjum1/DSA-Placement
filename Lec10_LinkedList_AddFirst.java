import java.util.*;

public class Lec10_LinkedList_AddFirst {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;

    public void addFirst(int data){
        // step1 = create new head
        node newNode = new node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 = newNode next = head
        newNode.next = head; //link
        // step3 = head = newNode
        head = newNode;
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
