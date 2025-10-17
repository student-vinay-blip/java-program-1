public class CheckSortedArray {

    // Recursive function to check if array is strictly increasing
    static boolean isSorted(int[] arr, int index) {
        // Base case: if we reach the last element
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is greater or equal to next, not strictly increasing
        if (arr[index] >= arr[index + 1]) {
            return false;
        }

        // Recursive call for next element
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        if (isSorted(arr, 0)) {
            System.out.println("Array is strictly increasing (sorted).");
        } else {
            System.out.println("Array is NOT strictly increasing.");
        }
    }
}
