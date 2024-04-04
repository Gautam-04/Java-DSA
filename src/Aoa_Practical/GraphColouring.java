package Aoa_Practical;

import java.util.Arrays;


public class GraphColouring {
    static  int V;
    public static void main(String[] args) {
        V = 4;
        int m = 3;
        boolean[][] graph = {
                {false,true,true,true},
                {true,false,true,false},
                {true,true,false,true},
                {true,false,true,false},
        };

        coloring(graph,m);
    }

    public static boolean coloring(boolean[][] graph, int m){
        int[] color = new int[V];

        for(int i = 0;i<V;i++){
            color[i] = 0;

            if(!graphColoringUtil(graph,m,color,0)){
                System.out.println("Soln does exists");
                return false;
            }
        }

        printSolution(color);
        return  true;
    }

    private static boolean graphColoringUtil(boolean[][] graph, int m, int[] color, int v) {
        if(v == V){
            return true;
        }

        for (int i = 1 ; i <= m; i++) {
            if(isSafe(v,graph,color,i)){
                color[v] = i;
                if(graphColoringUtil(graph,m,color,v+1)){
                    return true;
                }
                color[v] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int v, boolean[][] graph, int[] color, int c) {

        for(int i = 0; i< V;i++){
            if(graph[v][i] && c == color[i]){
                return false;
            }
        }
        return true;
    }

    private static void printSolution(int[] color) {
        System.out.println("Soln for the above graph colouring issue is");
        System.out.println(Arrays.toString(color));
    }
}
