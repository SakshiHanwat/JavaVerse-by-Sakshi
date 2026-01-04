// BipartiteGraph.java
import java.util.*;

public class BipartiteGraph {

    static class Edge {
        int src, dest;
        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] col = new int[graph.length];
        Arrays.fill(col, -1);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                q.add(i);
                col[i] = 0;

                while (!q.isEmpty()) {
                    int curr = q.remove();

                    for (Edge e : graph[curr]) {
                        if (col[e.dest] == -1) {
                            col[e.dest] = 1 - col[curr];
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));

        System.out.println(isBipartite(graph));
    }
}
