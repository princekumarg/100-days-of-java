package Graph;

import java.util.Arrays;

public class Kruskal {
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }

        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }

    static class Subset {
        int parent, rank;

        Subset(int p, int r) {
            parent = p;
            rank = r;
        }
    }

    static int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i) {
            subsets[i].parent = find(subsets, subsets[i].parent);
        }
        return subsets[i].parent;
    }

    public static void union(Subset[] subsets, int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);
        if (subsets[xroot].rank < subsets[yroot].rank) {
            subsets[xroot].parent = yroot;
        } else if (subsets[xroot].rank > subsets[yroot].rank) {
            subsets[yroot].parent = xroot;
        } else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }

    }

    public static void krusalAlgo(Edge[] edges, int v, int e) {
        Edge[] result = new Edge[v];
        int i = 0;
        int j = 0;
        for (i = 0; i < v; i++) {
            result[i] = new Edge(0, 0, 0);
        }
        Arrays.sort(edges);
        Subset[] subsets = new Subset[v];
        for (i = 0; i < v; i++) {
            subsets[i] = new Subset(i, 0);
        }
        i = 0;
        while (j < v - 1) {
            Edge next = edges[i++];
            int x = find(subsets, next.src);
            int y = find(subsets, next.dest);
            if (x != y) {
                result[j++] = next;
                union(subsets, x, y);
            }
        }
        for (i = 0; i < j; i++) {
            System.out.println(result[i].src + " " + result[i].dest + " " + result[i].weight);
        }

    }

    public static void main(String[] args) {
        int v = 4;
        int e = 5;
        Edge[] edges = new Edge[e];
        for (int i = 0; i < e; i++) {
            edges[i] = new Edge(0, 0, 0);
        }
        edges[0].src = 0;
        edges[0].dest = 1;
        edges[0].weight = 10;
        edges[1].src = 0;
        edges[1].dest = 2;
        edges[1].weight = 6;
        edges[2].src = 0;
        edges[2].dest = 3;
        edges[2].weight = 5;
        edges[3].src = 1;
        edges[3].dest = 3;
        edges[3].weight = 15;
        edges[4].src = 2;
        edges[4].dest = 3;
        edges[4].weight = 4;
        krusalAlgo(edges, v, e);

    }
}
