import java.util.LinkedList;
public class Lec19_MergedSort_LinkedList {
    private  node getMid(node head){
        node slow = head;
        node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow; // mid node
    }
    private node merge(node head1, node head2){
        node mergeLL = new node(-1);
        node temp = mergeLL;

        while ((head1 != null && head2 != null)){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }
        while (head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next = null;

        }
        public static node head;
        public static node tail;
    }
    public node mergeSort(node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid

        node mid = getMid(head);

        // left & right ms

        node rightHead = mid.next;

        node newLeft = mergeSort(head);
        node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        System.out.println(list);

        // sreching linkedlist ban kar hi hum mergeSort linkedlist call kar sakte hai


    }
}
