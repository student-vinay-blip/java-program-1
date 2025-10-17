public class MoveAllX {

    // Recursive function to move all 'x' to the end
    static String moveX(String str) {
        // Base case
        if (str.length() == 0) {
            return "";
        }

        char ch = str.charAt(0);  // first character
        String restOfString = moveX(str.substring(1));  // process the rest

        if (ch == 'x') {
            // if current char is 'x', add it to the end
            return restOfString + ch;
        } else {
            // else, keep it at the beginning
            return ch + restOfString;
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        String result = moveX(str);

        System.out.println("Original String: " + str);
        System.out.println("After moving all 'x' to the end: " + result);
    }
}
