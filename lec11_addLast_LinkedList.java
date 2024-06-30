import java.util.*;
public class lec11_addLast_LinkedList {
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

    public void addLast(int data){
        // step1
        node newNode = new node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        //step2
        tail.next = newNode;
        //step3
        tail = newNode;

    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(2);
        ll.addLast(1);
    }
}
