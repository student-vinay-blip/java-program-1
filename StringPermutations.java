public class StringPermutations {

    //  print all permutations
    static void printPermutations(String str, String ans) {
        
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            printPermutations(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All permutations of " + str + " are:");
        printPermutations(str, "");
    }
}
