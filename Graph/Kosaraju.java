package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class Kosaraju {
    public static void kosraju(ArrayList<ArrayList<Integer>> adj, int v) {
        Stack<Integer> st = new Stack<>();
        boolean visted[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visted[i] == false) {
                dfs(adj, i, visted);
            }
        }
        while (st.isEmpty() == false) {
            int u = st.pop();
            System.out.println(u + " ");
            for (int i : adj.get(u)) {
                if (visted[i] == false) {
                    visted[i] = true;
                    st.push(i);
                }
            }
        }
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean visted[]) {
        visted[s] = true;
        for (int u : adj.get(s)) {
            if (visted[u] == false) {
                dfs(adj, u, visted);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(4);
        kosraju(adj, v);
        for (int i = 0; i < v; i++) {
            System.out.println(adj.get(i));
        }
    }

}
