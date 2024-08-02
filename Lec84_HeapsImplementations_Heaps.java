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
          }

      }
      // get Min in Heap
      public int peek(){
          return arr.get(0);
      }
  }
    public static void main(String[] args){

    }
}
