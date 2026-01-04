// CheapestFlightKStops.java
import java.util.*;

public class CheapestFlightKStops {

    static class Edge {
        int src, dest, wt;
        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    static class Info {
        int node, cost, stops;
        Info(int n, int c, int s) {
            node = n;
            cost = c;
            stops = s;
        }
    }

    static int cheapestFlight(ArrayList<Edge>[] graph,
                              int src, int dest, int k) {

        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr.stops > k)
                continue;

            for (Edge e : graph[curr.node]) {
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (curr.cost + wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1, 100));
        graph[1].add(new Edge(1, 2, 100));
        graph[2].add(new Edge(2, 3, 100));
        graph[0].add(new Edge(0, 2, 500));

        System.out.println(cheapestFlight(graph, 0, 3, 1));
    }
}
