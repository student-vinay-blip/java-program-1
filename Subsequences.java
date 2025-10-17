public class Subsequences {

    // generate seqences
    static void printSubsequences(String str, String current, int index) {
        
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include 
        printSubsequences(str, current + str.charAt(index), index + 1);

        // Exclude 
        printSubsequences(str, current, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All subsequences of \"" + str + "\":");
        printSubsequences(str, "", 0);
    }
}
