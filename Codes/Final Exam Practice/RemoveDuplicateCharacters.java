import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        char[] chars = new char[input.length()];
        boolean[] exists = new boolean[256]; // To track character occurrences
        
        // Initialize the array with input characters
        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }

        // Iterate over the character array and remove duplicates
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (!exists[currentChar]) {
                exists[currentChar] = true;
                result += currentChar;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
