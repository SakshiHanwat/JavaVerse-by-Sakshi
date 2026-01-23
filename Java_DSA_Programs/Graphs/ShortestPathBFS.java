import java.util.*;

class ShortestPathBFS {

    static void shortestDistance(List<List<Integer>> graph, int source) {
        int n = graph.size();
        int[] distance = new int[n];

        Arrays.fill(distance, -1); // -1 means not visited
        Queue<Integer> queue = new LinkedList<>();

        distance[source] = 0;
        queue.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbour : graph.get(current)) {
                if (distance[neighbour] == -1) {
                    distance[neighbour] = distance[current] + 1;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println("Shortest distance from source " + source + ":");
        for (int i = 0; i < n; i++) {
            System.out.println(source + " -> " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        int vertices = 5;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected graph
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        shortestDistance(graph, 0);
    }
}
