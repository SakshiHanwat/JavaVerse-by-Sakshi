import java.util.*;

class CityTrafficGraph {

    static class Edge {
        int destination;
        int distance;

        Edge(int destination, int distance) {
            this.destination = destination;
            this.distance = distance;
        }
    }

    static class Graph {
        int vertices;
        List<List<Edge>> adjList;

        Graph(int vertices) {
            this.vertices = vertices;
            adjList = new ArrayList<>();

            for (int i = 0; i < vertices; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        void addRoad(int src, int dest, int distance) {
            adjList.get(src).add(new Edge(dest, distance));
            adjList.get(dest).add(new Edge(src, distance)); // bidirectional
        }

        void shortestPath(int source) {
            int[] dist = new int[vertices];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[source] = 0;

            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
            pq.add(new int[]{source, 0});

            while (!pq.isEmpty()) {
                int[] current = pq.poll();
                int u = current[0];

                for (Edge edge : adjList.get(u)) {
                    int v = edge.destination;
                    int weight = edge.distance;

                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.add(new int[]{v, dist[v]});
                    }
                }
            }

            System.out.println("Shortest distance from Location " + source + ":");
            for (int i = 0; i < vertices; i++) {
                System.out.println("To Location " + i + " -> " + dist[i] + " km");
            }
        }
    }

    public static void main(String[] args) {

        Graph city = new Graph(6);

        city.addRoad(0, 1, 4);
        city.addRoad(0, 2, 2);
        city.addRoad(1, 2, 5);
        city.addRoad(1, 3, 10);
        city.addRoad(2, 4, 3);
        city.addRoad(4, 3, 4);
        city.addRoad(3, 5, 11);

        city.shortestPath(0);
    }
}
