import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Lec52_ChocolaProblem_GreedyAlgorithms {
    public static void main(String[] args){
        int n = 4;
        int m = 6;
        Integer costVertical[] = {2, 1, 3, 1, 4}; //m-1
        Integer costHorizontal[] = {4, 1, 2}; //n-1

        Arrays.sort(costVertical, Collections.reverseOrder());
        Arrays.sort(costHorizontal, Collections.reverseOrder());

        int hori = 0, ver = 0;
        int horiPice = 1, verPice = 1;
        int cost = 0;

        while(hori < costHorizontal.length && ver < costVertical.length){
             if(costVertical[ver] <= costHorizontal[hori]){ // horizontal cut
                 cost += (costHorizontal[hori]*verPice);
                 horiPice++;
                 hori++;
             }else { // vertical cut
                 cost += (costVertical[ver]*horiPice);
                 verPice++;
                 ver++;

             }

        }

        while (hori < costHorizontal.length){
            cost += (costHorizontal[hori]*verPice);
            horiPice++;
            hori++;
        }
        while (ver < costVertical.length){
            cost += (costVertical[ver]*horiPice);
             verPice++;
            ver++;
        }

        System.out.println("Minimum cost of cuts = "+cost);
    }
}
