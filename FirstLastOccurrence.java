public class FirstLastOccurrence {

    
    static int first = -1;
    static int last = -1;

    static void findOccurrence(String str, int index, char element) {
        // Base case
        if (index == str.length()) {
            return;
        }

        char currentChar = str.charAt(index);

        // If character matches
        if (currentChar == element) {
            if (first == -1) {
                first = index;  // first
            }
            last = index;      //last
        }

        // Recursive call
        findOccurrence(str, index + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        char element = 'a';

        findOccurrence(str, 0, element);

        if (first != -1) {
            System.out.println("First occurrence of '" + element + "': " + first);
            System.out.println("Last occurrence of '" + element + "': " + last);
        } else {
            System.out.println("Character '" + element + "' not found in the string.");
        }
    }
}
