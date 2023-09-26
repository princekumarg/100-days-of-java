package Graph;

public class BellmanFord {
    public static void bellmanford(int[][] graph, int v, int e, int src) {
        int dist[] = new int[v];
        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        for (int i = 0; i < v - 1; i++) {
            for (int j = 0; j < e; j++) {
                if (dist[graph[j][0]] != Integer.MAX_VALUE && dist[graph[j][0]] + graph[j][2] < dist[graph[j][1]]) {
                    dist[graph[j][1]] = dist[graph[j][0]] + graph[j][2];
                }
            }
        }
        for (int i = 0; i < e; i++) {
            int x = graph[i][0];
            int y = graph[i][1];
            int weight = graph[i][2];
            if (dist[x] != Integer.MAX_VALUE && dist[x] + weight < dist[y]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }
        for (int i = 0; i < v; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int v = 5;
        int e = 8;
        int graph[][] = { { 0, 1, -1 }, { 0, 2, 4 }, { 1, 2, 3 }, { 1, 3, 2 }, { 1, 4, 2 }, { 3, 2, 5 }, { 3, 1, 1 },
                { 4, 3, -3 } };
        bellmanford(graph, v, e, 0);
    }
}
