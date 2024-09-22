import java.util.ArrayList;

public class Lec111_CreatingGraph_Graph {

    static class edge{
        int src;
        int dest;
        int wt;

        public edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void main(String[] args){

        int v = 5;
        ArrayList<edge>[] graph = new ArrayList[v];

        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        //0 vertes
        graph[0].add(new edge(0, 1, 5));

        // 1 vertes
        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 3));

        //2 vertes
        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 3, 1));
        graph[2].add(new edge(2, 4, 2));

        //3 vertes
        graph[3].add(new edge(3, 1, 3));
        graph[3].add(new edge(3, 2, 1));

        //4 vertes
        graph[4].add(new edge(4, 2, 2));

        // 2's neighbors
        for(int i=0; i<graph[2].size(); i++){
            edge e = graph[2].get(i);
            System.out.println(e.dest);
        }


    }
}
