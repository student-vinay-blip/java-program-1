public class ReverseStringRecursion {

    
    static String reverse(String str) {
        
        if (str.length() <= 1) {
            return str;
        }

    
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "abcd";
        String reversed = reverse(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
