public class FriendsPairing {

    
    static int countWays(int n) {
        // Base cases
        if (n <= 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        // Single + Pair case
        return countWays(n - 1) + (n - 1) * countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 4; // number of people
        System.out.println("Total ways to invite " + n + " people: " + countWays(n));
    }
}
