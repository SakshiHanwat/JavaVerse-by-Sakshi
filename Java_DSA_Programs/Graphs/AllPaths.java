// AllPaths.java
import java.util.*;

public class AllPaths {

    static class Edge {
        int src, dest;
        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    static void printAllPaths(ArrayList<Edge>[] graph, boolean[] vis,
                              int curr, int dest, String path) {

        if (curr == dest) {
            System.out.println(path + dest);
            return;
        }

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                vis[curr] = true;
                printAllPaths(graph, vis, e.dest, dest, path + curr);
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 5));

        boolean[] vis = new boolean[V];
        printAllPaths(graph, vis, 0, 5, "");
    }
}
