import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lec51_JobSequence_GreedyAlgorithms {

    static class Job{
        int deadLine;
        int profit ;
        int id ;

        public Job(int i, int d, int p){
            id = i;
            deadLine = d;
            profit = p;
        }

    }
    public static void main(String[] args){
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i<jobInfo.length; i++){
             jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
         // decending order sorts
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();

        int Time = 0;
        for(int i = 0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadLine> Time){
                seq.add(curr.id);
                Time++;
            }
        }
        // print Sequence
        System.out.println("Max Jobs : "+seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();


    }
}
