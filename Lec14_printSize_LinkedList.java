import java.util.LinkedList;

public class Lec14_printSize_LinkedList {
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
    public static int size;

    public void addFirst(int data){
        // step1 = create new node
        node newNode = new node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 = newNode next->head
        newNode.next = head;

        // step 3 = head -> newNode

        head = newNode;
    }

    public void addLast(int data){
        // step1 = create new node

        node newNode = new node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2

        newNode.next = tail;

        //step3

        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        // step1 craete new node
        node newNode = new node(data);
        size++;
        // step2 = temp->head
        node temp = head;
        int i = 0;
        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void print(int data){
        if (head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        node temp = head;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.add(2, 5);
        //list.print();

        System.out.println(list.size());
    }
}
