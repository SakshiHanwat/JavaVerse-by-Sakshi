import java.util.*;

public class Search_Sorted_Matrix
 {

    // Staircase Search Method
    public static boolean staircase_Search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + ", " + col + ")");
                return true;
            } 
            else if (key < matrix[row][col]) {
                col--;   // move left
            } 
            else {
                row++;   // move down
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {

        // Matrix must be row-wise & column-wise sorted
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 33;

        staircase_Search(matrix, key);
    }
}
