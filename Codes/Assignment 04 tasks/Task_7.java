//Task_7
import java.util.Scanner;
public class Task_7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i =1 , num ,sum=0;
    while(i<=10){
      System.out.print("Enter Number :");
      num = sc.nextInt();
      sum+=num;
      System.out.println("Sum = "+sum);
      i++;
    }
  }
}