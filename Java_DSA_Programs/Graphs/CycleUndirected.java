// CycleUndirected.java
import java.util.*;

public class CycleUndirected {

    static class Edge {
        int src, dest;
        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    static boolean detectCycle(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                if (detectCycle(graph, vis, e.dest, curr))
                    return true;
            } else if (e.dest != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));

        boolean[] vis = new boolean[V];
        System.out.println(detectCycle(graph, vis, 0, -1));
    }
}
