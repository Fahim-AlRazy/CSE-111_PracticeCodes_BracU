import java.util.Scanner;

public class RotateAndCountMatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Input the number of rotations
        System.out.print("Enter the number of rotations (k): ");
        int k = scanner.nextInt();

        char[] originalArray = new char[input.length()];
        char[] rotatedArray = new char[input.length()];

        // Fill the original array with input characters
        for (int i = 0; i < input.length(); i++) {
            originalArray[i] = input.charAt(i);
        }

        // Calculate the effective number of rotations
        int n = input.length();
        k = k % n; // Handle cases where k > n

        // Rotate the array by k positions
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = originalArray[i];
        }

        // Compare original and rotated arrays and count matches
        int matchCount = 0;
        for (int i = 0; i < n; i++) {
            if (originalArray[i] == rotatedArray[i]) {
                matchCount++;
            }
        }

        // Output the results
        System.out.println("Rotated String: " + new String(rotatedArray));
        System.out.println("Number of matching characters: " + matchCount);
    }
}
