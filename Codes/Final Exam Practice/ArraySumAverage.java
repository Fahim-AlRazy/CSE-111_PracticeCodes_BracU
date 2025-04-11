import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = sum / 5.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
