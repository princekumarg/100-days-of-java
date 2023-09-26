package Graph;

import java.util.ArrayList;

public class operationGraph {
    public static int bridgeUtil(int[][] graph) {
        int n = graph.length;
        int count = 0;
        boolean visted[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visted[i] == false) {
                count++;
                dfs(graph, i, visted);
            }
        }
        return count;
    }

    public static void apUtile(int[][] graph) {
        int n = graph.length;
        boolean visted[] = new boolean[n];
        int disc[] = new int[n];
        int low[] = new int[n];
        int parent[] = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            if (visted[i] == false) {
                apUtile(graph);
            }
        }

    }

    public static void dfs(int[][] graph, int s, boolean visted[]) {
        visted[s] = true;
        for (int u : graph[s]) {
            if (visted[u] == false) {
                dfs(graph, u, visted);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int graph[][] = new int[n][n];
        graph[0][1] = 1;
        graph[1][0] = 1;
        graph[1][2] = 1;
        graph[2][1] = 1;
        graph[3][4] = 1;
        graph[4][3] = 1;
        System.out.println(bridgeUtil(graph));
    }
}
