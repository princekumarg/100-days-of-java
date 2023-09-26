package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    public static void Topollogysort(ArrayList<ArrayList<Integer>> adj, int v) {
        int indegree[] = new int[v];
        for (int i = 0; i < v; i++) {
            for (int u : adj.get(i)) {
                indegree[u]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        while (q.isEmpty() == false) {
            int u = q.poll();
            System.out.println(u + " ");
            for (int i : adj.get(u)) {
                indegree[i]--;
                if (indegree[i] == 0) {
                    q.add(i);
                }
            }
        }
    }

    /*
     * public static void TopollogysortDFS(ArrayList<ArrayList<Integer>> adj, int
     * v){
     * boolean visted[] = new boolean[v];
     * BFS_DFS.dfs=dfs(adj,v,0,visted);
     * for (int i = 0; i < v; i++) {
     * if (visted[i] == false) {
     * dfs(adj, v, i, visted);
     * }
     * }
     * }
     */

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(3);
        Topollogysort(adj, v);
    }
}
