import java.util.*;

public class CycleDetectionGraph {

    static class Graph {
        int vertices;
        List<List<Integer>> adjList;

        Graph(int v) {
            vertices = v;
            adjList = new ArrayList<>();

            for (int i = 0; i < v; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v) {
            adjList.get(u).add(v);
            adjList.get(v).add(u); // undirected graph
        }

        boolean isCyclic() {
            boolean[] visited = new boolean[vertices];

            for (int i = 0; i < vertices; i++) {
                if (!visited[i]) {
                    if (bfsCycleCheck(i, visited)) {
                        return true;
                    }
                }
            }
            return false;
        }

        boolean bfsCycleCheck(int src, boolean[] visited) {
            Queue<int[]> queue = new LinkedList<>();
            visited[src] = true;
            queue.add(new int[]{src, -1}); // node, parent

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int node = current[0];
                int parent = current[1];

                for (int neighbor : adjList.get(node)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(new int[]{neighbor, node});
                    } else if (neighbor != parent) {
                        return true; // cycle found
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0); // creates cycle

        if (graph.isCyclic()) {
            System.out.println("Cycle exists in the graph");
        } else {
            System.out.println("No cycle in the graph");
        }
    }
}
