import java.util.HashMap;
import java.util.LinkedList;

public class Lec93_ImplementationOfHashMapCode_HashMap {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value){
                this.key = key ;
                this.value = value;
            }

        }
        private int size ;
        private LinkedList<Node> buckets[] ;


        @SuppressWarnings("unchecked")
        public HashMap(){
            this.size = 0;
            this.buckets = new LinkedList[4];

            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

    }
}
