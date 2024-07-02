//import java.util.LinkedList;
//public class lec12_Print_LinkedList {
//    public static class node{
//        int data;
//        node next;
//
//        public node(int data){
//            this.data = data;
//            this.next = null;
//
//        }
//    }
//    public static node head;
//    public static node tail;
//
//    public void addFirst1(int data){
//        node newNode = new node(data);
//        if(head == null){
//            head = tail = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//    }
//    public void addLast1(int data){
//        node newNode = new node(data);
//        if(head == null){
//            head = tail = newNode;
//            return;
//        }
//        tail.next = newNode;
//        tail = newNode;
//    }
//
//    public void print1(){
//        if(head == null){
//            System.out.println("LinkedList is empty");
//            return;
//        }
//        node temp = head;
//
//        while(temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//        LinkedList ll = new LinkedList();
//        ll.addFirst1(1);
//    }
//}
