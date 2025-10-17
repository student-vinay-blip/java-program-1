public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    static void solveTowerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        // Move top n-1 disks from fromRod to auxRod using toRod
        solveTowerOfHanoi(n - 1, fromRod, auxRod, toRod);

        // Move remaining disk from fromRod to toRod
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        // Move n-1 disks from auxRod to toRod using fromRod
        solveTowerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        System.out.println("Tower of Hanoi solution for " + n + " disks:\n");
        solveTowerOfHanoi(n, 'A', 'C', 'B'); // A, B, and C are names of rods
    }
}
