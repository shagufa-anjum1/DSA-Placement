import java.util.*;

public class Lec43_QuestionOfStackAndQueueUsingDeque_Queue {

    public static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // add function
        public void push(int data){
            deque.addLast(data);
        }
        // Remove function
        public int pop(){
            return deque.removeLast();
        }
        // peek function
        public int peek(){
            return deque.getLast();
        }
    }

    // main class
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek : "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
