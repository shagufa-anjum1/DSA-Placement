import java.util.ArrayList;

public class Lec84_HeapsImplementations_Heaps {
  static class Heap{
       static ArrayList<Integer> arr = new ArrayList<>();

      public static void add(int data){
          // add at last index
          arr.add(data);
          // x is child index
          int x = arr.size()-1;
          // parent index
          int parent = (x-1)/2;

          while ((arr.get(x) < arr.get(parent))){ // o(logn)
              // swap
              int temp = arr.get(x);
              arr.set(x, arr.get(parent));
              arr.set(parent, temp);

              x = parent;
              parent = (x-1)/2;
          }

      }
      // get Min in Heap
      public int peek(){

          return arr.get(0);
      }
      private  void heapify(int i){
          int left = 2*i+1;
          int right = 2*i+2;
          int minIdx = i;

          if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
              minIdx = left;
          }

          if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
              minIdx = right;
          }

          if(minIdx != i){
              // swap
              int temp = arr.get(i);
              arr.set(i, arr.get(minIdx));
              arr.set(minIdx, temp);

              heapify(minIdx);
          }
      }

      public boolean isEmpty(){

          return arr.size() == 0;
      }


      public int remove(){
          int data = arr.get(0);

          // step1-swap first & last
          int temp = arr.get(0);
          arr.set(0, arr.get(arr.size()-1));
          arr.set(arr.size()-1, temp);

          // step2 - delete last
          arr.remove(arr.size()-1);

          // step3 - heapify
          heapify(0);
          return data;
      }
  }
    public static void main(String[] args){
      Heap pq = new Heap();
      pq.add(3);
      pq.add(4);
      pq.add(1);
      pq.add(5);

      while (!pq.isEmpty()){
          System.out.println(pq.peek());
          pq.remove();
      }

    }
}
