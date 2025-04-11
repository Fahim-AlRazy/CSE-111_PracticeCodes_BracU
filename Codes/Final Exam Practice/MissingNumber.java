import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array (n): ");
        int n = scanner.nextInt();
        int[] numbers = new int[n - 1];
        
        System.out.println("Enter the numbers:");
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        int totalSum = n * (n + 1) / 2;
        int missingNumber = totalSum - sum;
        
        System.out.println("The missing number is: " + missingNumber);
    }
}
