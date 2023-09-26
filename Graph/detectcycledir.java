package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//it is called as kahn's algorithm
public class detectcycledir {
    public static int detectcycle(ArrayList<ArrayList<Integer>> adj, int v) {
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
        int count = 0;
        while (q.isEmpty() == false) {
            int u = q.poll();
            for (int i : adj.get(u)) {
                indegree[i]--;
                if (indegree[i] == 0) {
                    q.add(i);
                }
            }
            count++;
        }
        return count != v ? 1 : 0;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(1);
        System.out.println(detectcycle(adj, v));
    }
}
