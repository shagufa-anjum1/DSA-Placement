import java.util.LinkedList;

public class Lec13_AddMidle_LinkedList {
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

    public void add(int idx, int data){
        node newNode = new node(data);
        node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        // i=idex-1; temp--> prev

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(2, 9);
    }
}
