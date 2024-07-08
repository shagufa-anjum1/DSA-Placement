import java.util.LinkedList;

public class Lec22_ReverseDouble_LinkedList {
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

    public void reversed(){
        node curr = head;
        node prev = null;
        node next;

        while(curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
           head = prev;
        }
    }
    public static void main(String[] args){
       // DoubleLL dll = new DoubleLL();
        LinkedList<Integer> dll = new LinkedList<>();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        System.out.println(dll);
        System.out.println(dll.size());
        dll.reversed();
        System.out.println(dll);
        System.out.println(dll.size());
//        mere saare code sahi hai pta nhi ye class ko fatch q nhi kar rha hain
    }
}
