import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Lec46_ActivitiesSlectionProbByShorting_GreedyAlgorithms {

    public static void main(String[] args){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // sorting

        int activities[][] = new int[start.length][3];
        for(int i=0; i< start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // lambda function -> shortForm of big form
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1 activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastTime = activities[0][2];

        for(int i=0; i<end.length; i++){

            if(activities[i][1] >= lastTime){
                // activity selection
                maxAct++;
                ans.add(activities[i][0]);
                lastTime = activities[i][2];
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
