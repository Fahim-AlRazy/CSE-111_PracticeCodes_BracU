public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 4, 15, 7, 19};
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        // Find the largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Largest: " + secondMax);
    }
}
