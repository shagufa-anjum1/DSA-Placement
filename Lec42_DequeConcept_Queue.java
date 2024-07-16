import java.util.*;

public class Lec42_DequeConcept_Queue {

    public static void main(String[] args){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.getFirst();
        System.out.println(deque);
        deque.getLast();
        System.out.println(deque);
        deque.addLast(5);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

    }
}
