public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        k = k % n; // In case k is greater than the array size

        // Create a new array to store rotated elements
        int[] rotated = new int[n];

        // Place last k elements at the beginning
        for (int i = 0; i < k; i++) {
            rotated[i] = arr[n - k + i];
        }

        // Place the rest of the elements
        for (int i = k; i < n; i++) {
            rotated[i] = arr[i - k];
        }

        // Print the rotated array
        System.out.println("Rotated array:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}
