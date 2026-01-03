public class AdjacencyMatrix {

    public static void main(String[] args) {
        int V = 4;
        int[][] matrix = new int[V][V];

        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[1][3] = 1;

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
