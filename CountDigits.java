import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int digitCount = 0;

    
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                digitCount++;
            }
        }

    
        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
