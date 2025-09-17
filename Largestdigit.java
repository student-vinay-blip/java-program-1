
import java.util.*;

public class Largestdigit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int maxDigit = -1; // To store the largest digit found

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0'; // Convert character to integer
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
            }
        }

        if (maxDigit == -1) {
            System.out.println("No digits found in the input.");
        } else {
            System.out.println("Largest digit: " + maxDigit);
        }

        scanner.close();
    }
}
