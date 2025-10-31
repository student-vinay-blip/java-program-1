public class SudokuSolver {

    // Function to print the Sudoku grid
    static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int d = 0; d < 9; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.println();

            if ((r + 1) % 3 == 0)
                System.out.println();
        }
    }

    // Check if placing num in board[row][col] is valid
    static boolean isSafe(int[][] board, int row, int col, int num) {

        // Check if num already in the row
        for (int x = 0; x < 9; x++)
            if (board[row][x] == num)
                return false;

        // Check if num already in the column
        for (int x = 0; x < 9; x++)
            if (board[x][col] == num)
                return false;

        // Check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i + startRow][j + startCol] == num)
                    return false;

        return true;
    }

    // Recursive function to solve the Sudoku
    static boolean solveSudoku(int[][] board, int n) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        // Find an empty cell (with 0)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty)
                break;
        }

        // No empty cell → puzzle solved
        if (isEmpty)
            return true;

        // Try numbers 1–9
        for (int num = 1; num <= n; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                if (solveSudoku(board, n))
                    return true;

                // Backtrack
                board[row][col] = 0;
            }
        }
        return false; // Trigger backtracking
    }

    // Main method
    public static void main(String[] args) {
        int[][] board = new int[][] {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        int n = 9;

        System.out.println("Original Sudoku:\n");
        printBoard(board);

        if (solveSudoku(board, n)) {
            System.out.println("Solved Sudoku:\n");
            printBoard(board);
        } else {
            System.out.println("No solution exists!");
        }
    }
}
