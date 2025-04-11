public class MissingNumber2{
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        // Calculate the sum of the array elements
        for (int num : arr) {
            actualSum += num;
        }

        // Missing number is the difference between expected and actual sum
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}
