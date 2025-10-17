import java.util.HashSet;

public class RemoveDuplicates {

    // Function to remove duplicates
    static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);          
                result.append(ch);    
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abbccda";
        String result = removeDuplicates(str);

        System.out.println("Original String: " + str);
        System.out.println("After removing duplicates: " + result);
    }
}
