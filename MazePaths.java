public class MazePaths {

    // Recursive function to count total paths
    static int countPaths(int n, int m) {
        // Base case: if we reach the destination cell
        if (n == 1 || m == 1) {
            return 1;
        }

        // Move either down or right
        int downPaths = countPaths(n - 1, m);
        int rightPaths = countPaths(n, m - 1);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 3; // number of rows
        int m = 3; // number of columns

        System.out.println("Total paths in a " + n + "x" + m + " maze: " + countPaths(n, m));
    }
}
