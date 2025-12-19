import java.util.*;

public class Diagonal_Sum_2DMatrix {

    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        /*for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal (avoid double count)
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }*/
       //optimized code
       for(int i = 0; i<matrix.length; i++){
        //primary diagonal
        sum += matrix[i][i];
        //secondary diagonal
        if(i != matrix.length-1-i){
            sum+= matrix[i][matrix.length-i-1];
        }
       }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println(DiagonalSum(matrix));
    }
}
