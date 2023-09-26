package Graph;

import java.util.Arrays;

public class MinimumSpanningTree {
    static int V = 5;

    public static int MiniSpanTree(int[][] graph) {
        int key[] = new int[V];
        int res = 0;
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        boolean mst[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            int u = -1;
            for (int j = 0; j < V; j++) {
                if (mst[j] == false && (u == -1 || key[j] < key[u])) {
                    u = j;
                }
            }
            mst[u] = true;
            res = res + key[u];
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && mst[v] == false) {
                    key[v] = Math.min(key[v], graph[u][v]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };
        System.out.println(MiniSpanTree(graph));
    }
}
