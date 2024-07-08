import java.util.*;
public class Lec21_Double_LinkedList {
    public class node{
        int data;
        node next;
        node prev;

        public node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;

    public void addFirst(int data){
        // create node

        node newNode = new node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("double LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public  void print(){
        node temp = head;
        while (temp != null){
            System.out.println(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        LinkedList<Integer> dll = new LinkedList<>();
        // using double linkedlist here not this linkedlist like this
        // DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        System.out.println(dll);
        System.out.println(dll.size());
        dll.removeFirst();
        System.out.println(dll);
        System.out.println(dll.size());
        dll.removeFirst();
        System.out.println(dll);
        System.out.println(dll.size());

    }
}
