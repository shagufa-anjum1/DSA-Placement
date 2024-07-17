import java.util.*;

public class Lec44_ImplementOfDequeUsingQueue_Queue {
     static class Queue{
        Deque<Integer> deque = new LinkedList<>();
        // add function
        public void add(int data){
            deque.addLast(data);
        }
        // Remove Function
        public int remove(){
            return deque.removeFirst();
        }

        // Peek Function

        public int peek(){
            return deque.getFirst();
        }

    }
    public static void main(String[] args){
       Queue q = new Queue();
       q.add(1);
       q.add(2);
       q.add(3);

        System.out.println("Peek : "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
