import java.util.LinkedList;

public class Lec15_RemoveFirst_LinkedList {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;

    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
        node temp = head;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.removeFirst();
        //list.print();
    }
}
