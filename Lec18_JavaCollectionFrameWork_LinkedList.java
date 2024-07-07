import java.util.LinkedList;

public class Lec18_JavaCollectionFrameWork_LinkedList {
    public static  void main(String[] args){
        // create Linkedlist
        LinkedList<Integer> list = new LinkedList<>();
        // Add Linkedlist
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        System.out.println(list);
        // Remove LinkedList
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
