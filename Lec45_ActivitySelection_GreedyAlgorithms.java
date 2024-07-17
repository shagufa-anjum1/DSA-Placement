import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Lec45_ActivitySelection_GreedyAlgorithms {

    public static void main(String[] args){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};


        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
          // 1 activity
        maxAct = 1;
        ans.add(0);
        int lastTime = end[0];

        for(int i=0; i<end.length; i++){

            if(start[i] >= lastTime){
                // activity selection
                maxAct++;
                ans.add(i);
                lastTime = end[i];
            }

        }

        // print
        System.out.println("Maximum Activities : "+ maxAct);
        // print which activity select
        for(int i = 0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}
