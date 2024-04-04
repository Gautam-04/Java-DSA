package Aoa_Practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalsAlgo {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 4, 1, 8},
                {2, 0, 2, 12, 0},
                {4, 2, 0, 2, 1},
                {1, 12, 2, 0, 2},
                {8, 0, 1, 2, 0}
        };

        kruskalMST(graph);
    }

    private static void kruskalMST(int[][] graph) {
        int V = graph.length;
        List<int[]> edges = new ArrayList<>();
        int totalWeight = 0;

        for (int i = 0; i < V; i++) {
            for (int j = i+1; j < V; j++) {
                if(graph[i][j] != 0){
                    edges.add(new int[]{i,j,graph[i][j]});
                }
            }
        }

        Collections.sort(edges,(a,b) -> a[2] - b[2]);

        int[] parent = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        List<int[]> mstEdges = new ArrayList<>();

        for(int[] edge : edges){
            int x = find(parent,edge[0]);
            int y = find(parent,edge[1]);

            if(x!=y){
                mstEdges.add(edge);
                union(parent,x,y);
            }
        }

        System.out.println("Following  are the edges of the kruskals algo: ");
        for (int[] edge: mstEdges) {
            System.out.println(edge[0] + " - " + edge[1] + " Weights: " + edge[2]);
            totalWeight += edge[2];
        }

        System.out.println("Total mst weights is :- " + totalWeight);
    }

    private static void union(int[] parent,int x, int y) {
        int xset = find(parent,x);
        int yset = find(parent,y);
        parent[xset] = yset;
    }

    private static int find(int[] parent, int i) {
        if(parent[i] == i){
            return i;
        }
        return find(parent,parent[i]);
    }
}
