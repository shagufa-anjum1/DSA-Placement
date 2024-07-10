import java.util.Stack;

public class Lec28_stockSpan_Stack {

   public static void stackSpan(int stocks[], int span[]){
       Stack<Integer> s = new Stack<>();
       span[0] = 1;
       s.push(0);

       for(int i=1; i<stocks.length; i++){
           int currPrice = stocks[i];
//
//           while (!s.isEmpty() && currPrice > stocks.[s.peek()]){
//               s.pop();
//           }
           if(s.isEmpty()){
               span[i] = i+1;
           }else {
               int prevHigh = s.peek();
               span[i] = i-prevHigh;
           }
           s.push(i);
       }
   }

   public static void main(String[] args){
       int stacks[] = {100, 80, 60, 70, 60, 85, 100};
       int span[] ;
       //stackSpan(stacks, span);

//       for(int i=0; i<span.length; i++){
//           System.out.println(span[i]+" ");
//       }
   }
}
