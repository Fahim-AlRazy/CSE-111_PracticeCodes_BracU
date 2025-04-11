//Task_3
import java.util.Scanner;
public class Task_3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){ 
      System.out.print("Enter a Number : ");
      int num = sc.nextInt();
      if(num<0){
        break;
      }
      int sqr = num*num;
      System.out.println("Square of the inputted number  is : "+sqr);
    }
  }
}