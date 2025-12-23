public class N_Queens_thridway {

    public static boolean isSafe(char board[][], int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {

        // base case → ek solution mil gaya
        if (row == board.length) {
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                if (nQueens(board, row + 1)) {
                    return true;   // 💡 STOP after 1 solution
                }

                board[row][j] = 'x'; // backtracking
            }
        }

        return false; // koi solution nahi mila
    }

    public static void printBoard(char board[][]) {
        System.out.println("---- One Valid Solution ----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        if (nQueens(board, 0)) {
            System.out.println("Yes, problem CAN be solved ✅");
            printBoard(board);
        } else {
            System.out.println("No, problem CANNOT be solved ❌");
        }
    }
}
