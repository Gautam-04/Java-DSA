package Aoa_Practical;

public class Prims {
    private static int V;

    public static void main(String[] args) {
        V = 5;
        int[][] graph = {
                {0, 2, 4, 1, 8},
                {2, 0, 2, 12, 0},
                {4, 2, 0, 2, 1},
                {1, 12, 2, 0, 2},
                {8, 0, 1, 2, 0},
        };

        primMst(graph);
    }

    private static void primMst(int[][] graph) {
        int[] parent = new int[V];
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }

            }
        }

        printMst(parent, graph);

    }

    private static void printMst(int[] parent, int[][] graph) {
        System.out.println("Edges \t Weights");
        int totalValue = 0;
        for (int i = 1; i < V; i++) { // Start from 1 to skip the root node
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
            totalValue += graph[i][parent[i]];
        }
        System.out.println("Total weight of mst is: " + totalValue);
    }

    private static int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, min_index = -1;
        for (int i = 0; i < V; i++) {
            if (mstSet[i] == false && key[i] < min) {
                min = key[i];
                min_index = i;
            }
        }
        return min_index;
    }
}
