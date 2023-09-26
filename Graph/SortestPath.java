package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SortestPath {
    static class pair {
        int first, second;

        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void shortestPath(ArrayList<ArrayList<pair>> adj, int v, int s) {
        int dist[] = new int[v];
        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;
        boolean visted[] = new boolean[v];
        Arrays.fill(visted, false);
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visted[s] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (pair p : adj.get(u)) {
                if (visted[p.first] == false) {
                    dist[p.first] = dist[u] + p.second;
                    visted[p.first] = true;
                    q.add(p.first);
                }
            }
        }
        for (int i = 0; i < v; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    /*
     * public static void shortestpathdag(ArrayList<ArrayList<pair>> adj, int s, int
     * v) {
     * int dist[] = new int[v];
     * for (int i = 0; i < v; i++) {
     * dist[i] = Integer.MAX_VALUE;
     * }
     * dist[s] = 0;
     * TopologicalSort.Topollogysort(adj, v);
     * for (int i = 0; i < v; i++) {
     * for (pair p : adj.get(i)) {
     * if (dist[i] != Integer.MAX_VALUE && dist[i] + p.second < dist[p.first]) {
     * dist[p.first] = dist[i] + p.second;
     * }
     * }
     * }
     * 
     * }
     */

    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<pair>> adj = new ArrayList<ArrayList<pair>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new pair(1, 2));
        adj.get(0).add(new pair(4, 1));
        adj.get(1).add(new pair(2, 3));
        adj.get(2).add(new pair(3, 6));
        adj.get(4).add(new pair(2, 2));
        adj.get(4).add(new pair(5, 4));
        adj.get(5).add(new pair(3, 1));
        shortestPath(adj, v, 0);
    }
}
