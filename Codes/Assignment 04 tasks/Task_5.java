//Task_5
import java.util.Scanner;
public class Task_5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter how many number you want to take input : ");
    int till = sc.nextInt() , from = 1;
    int non_neg =0 , neg =0;
    int num ;
    while(from<=till){
      System.out.print("Enter number "+from+" : ");
      num = sc.nextInt() ;
      if(num>=0){
        non_neg ++;
      }
      else if(num<0){
        neg ++;
      }
      from++;
    }
    System.out.println(non_neg+" Non Negative numbers ");
    System.out.println(neg+" Negative numbers ");
  }
}