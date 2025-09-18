
public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
