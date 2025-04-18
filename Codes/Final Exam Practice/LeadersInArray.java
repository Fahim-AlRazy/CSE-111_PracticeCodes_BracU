public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int maxFromRight = arr[arr.length - 1];
        
        System.out.println("Leaders in the array:");
        System.out.print(maxFromRight + " "); // Last element is always a leader

        // Traverse the array from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}
