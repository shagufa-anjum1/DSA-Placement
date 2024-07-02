import java.util.LinkedList;

public class Lec16_RemoveLast_LinkedList {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next = null;

        }
    }
    public static node head;
    public static node tail;
    public static int size;

    public int removeLast(){
        if(size==0){
            System.out.println("list is empty!");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            return val;

        }
        // prev: i=size-2
        node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.removeLast();
        System.out.println(list.size());
    }
}
