import java.util.Scanner;

public class gpt_task8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range in which you want to calculate total armstrong numbers.\nFrom: ");
    int from = sc.nextInt();
    System.out.print("Till: ");
    int till = sc.nextInt();
    
    System.out.println("The Armstrong numbers are: ");
    for (int i = from; i <= till; i++) {
      // Determination of total digits
      int now = i;
      int digit = 0;
      int sum = 0;
      int temp = i;
      
      // Calculate number of digits
      while (temp > 0) {
        temp = temp / 10;
        digit++;
      }
      
      // Reset temp to the original number for calculating Armstrong number
      temp = i;
      
      // Calculate the sum of digits raised to the power of digit
      while (temp > 0) {
        int rem = temp % 10;
        sum += (int) Math.pow(rem, digit);
        temp = temp / 10;
      }
      
      // Check if the sum equals the original number
      if (sum == i) {
        System.out.println(i);
      }
    }
  }
}
