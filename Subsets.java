import java.util.*;

public class Subsets {

    // Recursive function to print all subsets
    static void printSubsets(int n, ArrayList<Integer> subset) {
        // Base case
        if (n == 0) {
            System.out.println(subset);
            return;
        }

        // Include n in the subset
        subset.add(n);
        printSubsets(n - 1, subset);

        // Exclude n from the subset 
        subset.remove(subset.size() - 1);
        printSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        System.out.println("All subsets of first " + n + " natural numbers:");
        printSubsets(n, subset);
    }
}
