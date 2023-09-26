package Graph;

import java.util.Arrays;

public class DijkstraAlgorithm {
    public static int[] dijkstra(int graph[][], int src) {
        int v = graph.length;
        int dist[] = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        boolean fin[] = new boolean[v];
        for (int i = 0; i < v - 1; i++) {
            int u = -1;
            for (int j = 0; j < v; j++) {
                if (!fin[i] && (u == -1 || dist[j] < dist[u])) {
                    u = j;
                }
            }
            fin[u] = true;
            for (int k = 0; k < v; k++) {
                if (!fin[v] && graph[u][k] != 0) {
                    dist[k] = Math.min(dist[k], dist[u] + graph[u][k]);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };
        int dist[] = dijkstra(graph, 0);
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }
    }
}
