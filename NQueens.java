public class NQueens {

    // Function to print the board configuration
    static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if it's safe to place a queen at board[row][col]
    static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check column above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    // Recursive function to solve N-Queens problem
    static void solveNQueens(int[][] board, int row, int n) {
        // Base case: all queens are placed
        if (row == n) {
            printBoard(board, n);
            return;
        }

        // Try placing the queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                // Place queen
                board[row][col] = 1;

                // Recurse to place rest of the queens
                solveNQueens(board, row + 1, n);

                // Backtrack — remove queen
                board[row][col] = 0;
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        int n = 4;  // You can change N (4, 5, 8, etc.)
        int[][] board = new int[n][n];

        System.out.println("Solutions for " + n + "-Queens problem:\n");
        solveNQueens(board, 0, n);
    }
}
