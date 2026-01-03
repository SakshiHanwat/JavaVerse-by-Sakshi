import java.util.*;

public class AdjacencyList {

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);

        for (int i = 0; i < V; i++)
            System.out.println(i + " -> " + graph[i]);
    }
}
