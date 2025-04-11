import java.util.Scanner;

public class Task8_chatGPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String print = "";  // Using a normal string for concatenation

        // Track the alternating case based on the count of alphabetic characters
        int alphabeticIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the current character is a letter
            if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
                // If it's an alphabetic character, apply alternating caps logic
                if (alphabeticIndex % 2 == 0) {
                    // If the index is even, use lowercase
                    print = print + (char) Character.toLowerCase(currentChar);
                } else {
                    // If the index is odd, use uppercase
                    print = print + (char) Character.toUpperCase(currentChar);
                }
                // Increment alphabeticIndex only when a letter is processed
                alphabeticIndex++;
            } else {
                // If it's not an alphabetic character, just concatenate it as is
                print = print + currentChar;
            }
        }

        // Print the result
        System.out.println(print);
    }
}
