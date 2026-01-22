import java.util.*;

class CoursePrerequisiteGraph {

    static class Graph {
        int vertices;
        List<List<Integer>> adjList;

        Graph(int vertices) {
            this.vertices = vertices;
            adjList = new ArrayList<>();

            for (int i = 0; i < vertices; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        // Directed edge: prerequisite -> course
        void addPrerequisite(int prereq, int course) {
            adjList.get(prereq).add(course);
        }

        boolean isCyclicUtil(int node, boolean[] visited, boolean[] recStack) {
            if (recStack[node])
                return true;

            if (visited[node])
                return false;

            visited[node] = true;
            recStack[node] = true;

            for (int neighbour : adjList.get(node)) {
                if (isCyclicUtil(neighbour, visited, recStack))
                    return true;
            }

            recStack[node] = false;
            return false;
        }

        boolean hasCycle() {
            boolean[] visited = new boolean[vertices];
            boolean[] recStack = new boolean[vertices];

            for (int i = 0; i < vertices; i++) {
                if (isCyclicUtil(i, visited, recStack))
                    return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {

        Graph courses = new Graph(5);

        // course dependencies
        courses.addPrerequisite(0, 1);
        courses.addPrerequisite(1, 2);
        courses.addPrerequisite(2, 3);
        courses.addPrerequisite(3, 4);
        // courses.addPrerequisite(4, 1); // uncomment to create cycle

        if (courses.hasCycle()) {
            System.out.println("❌ Course plan is NOT valid (Cycle detected)");
        } else {
            System.out.println("✅ Course plan is valid (No cycle)");
        }
    }
}
