package Graph;

import java.util.ArrayList;

public class detectcycle {
    public static boolean DFSREC(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visted, int parent) {
        visted[s] = true;
        for (int u : adj.get(s)) {
            if (visted[u] == false) {
                if (DFSREC(adj, u, visted, s) == true) {
                    return true;
                } else if (u != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean DFS(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visted[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visted[i] == false) {
                if (DFSREC(adj, i, visted, -1) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(1);
        adj.get(1).add(3);
        System.out.println(DFS(adj, v));
    }
}
