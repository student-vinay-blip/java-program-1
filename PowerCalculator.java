
import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        double result = 1;

        
        for (int i = 1; i <= Math.abs(exponent); i++) {
            result *= base;
        }

        
        if (exponent < 0) {
            result = 1 / result;
        }

    
        System.out.println(base + " raised to the power " + exponent + " is: " + result);

        scanner.close();
    }
}
