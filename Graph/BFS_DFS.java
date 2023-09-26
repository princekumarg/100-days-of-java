package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFS {
    public static void bfs(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean visted[] = new boolean[v + 1];
        Queue<Integer> q = new LinkedList<Integer>();
        visted[s] = true;
        q.add(s);
        while (q.isEmpty() == false) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int i : adj.get(u)) {
                if (visted[i] == false) {
                    visted[i] = true;
                    q.add(i);
                }
            }
        }

    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int v, int s, boolean[] visted) {
        visted[s] = true;
        System.out.print(s + " ");
        for (int i : adj.get(s)) {
            if (visted[i] == false) {
                dfs(adj, v, i, visted);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        bfs(adj, v, 0);
        System.out.println();
        boolean visted[] = new boolean[v];
        dfs(adj, v, 0, visted);

    }
}
