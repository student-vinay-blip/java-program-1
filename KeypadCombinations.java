import java.util.*;

public class KeypadCombinations {

    // (classic mobile keypad)
    static String[] keypad = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    // Recursive function to generate combinations
    static void printCombinations(String digits, String current, int index) {
        if (index == digits.length()) {
            System.out.println(current);
            return;
        }

        char digitChar = digits.charAt(index);
        int digit = digitChar - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            printCombinations(digits, current + letters.charAt(i), index + 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23"; // example input
        System.out.println("Keypad combinations for \"" + digits + "\":");
        printCombinations(digits, "", 0);
    }
}
