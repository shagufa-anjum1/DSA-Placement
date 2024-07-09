import java.util.LinkedList;
import java.util.Stack;
import java.util.*;
public class Lec24_ImplementationOfStackByLinkedList_Stack {
    public static class node {
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;

        }

    }
    public static node head;
    public static node tail;
    public static int size;
    static  class Stack{
        static node head = null;
        public static boolean isEmpty(){
            return head == null;
        }
        // push
        public void push(int data){
            // creating node
            node newNode = new node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
