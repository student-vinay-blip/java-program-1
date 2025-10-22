public class PlaceTiles {

    // Recursive function to count number of ways
    static int placeTiles(int n, int m) {
        // Base cases
        if (n < m) {
            return 1;
        }
        if (n == m) {
            return 2;
        }

        
        return placeTiles(n - 1, m) + placeTiles(n - m, m);
    }

    public static void main(String[] args) {
        int n = 4;  // floor length
        int m = 2;  // tile length

        System.out.println("Total ways to place tiles on a " + n + "x" + m + " floor: " + placeTiles(n, m));
    }
}
