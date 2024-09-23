import java.util.*;

public class Lec113_DFS_Graph {
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

    static void createGraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        //0 vertes
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        //1 vertes
        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        //2 vertes
        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));

        //3 vertes
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));

        //4 vertes
        graph[4].add(new edge(4, 2, 0));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));

        //5 vertes
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));

        //6 vertes
        graph[6].add(new edge(6, 5, 1));

    }

     public static void dfs(ArrayList<edge>[] graph, int curr, boolean vis[]){
         System.out.print(curr + " ");
         vis[curr] = true;

         for(int i=0; i<graph[curr].size(); i++){
              edge e = graph[curr].get(i);
              if(!vis[e.dest]){
                  dfs(graph, e.dest, vis);
              }
         }


     }
    public static void main(String[] args){
        int v = 7;
        ArrayList<edge> graph [] = new ArrayList[v];
        createGraph(graph);

        dfs(graph, 0, new boolean[v]);


    }
}
