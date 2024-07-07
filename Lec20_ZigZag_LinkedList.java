import java.util.LinkedList;
public class Lec20_ZigZag_LinkedList {

    public  static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;

    public void ZigZag(){
        // 1 find mid
        node slow = head;
        node fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node mid = slow ;

        // 2 reverse second half
        node curr = mid.next;
        mid.next = null;
        node prev = null;
        node next;


        while (curr != null){
            next = curr.next;
            curr.next = prev;
            curr = next;
        }
        node left = head;
        node right = prev;
        node nextL, nextR;

        // 3 alternative merge ZigZag Merge

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left.next = nextL;
            right = nextR;
        }




    }
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println(list);

    }
}
