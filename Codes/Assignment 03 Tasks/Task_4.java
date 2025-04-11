import java.util.Scanner;
public class Task_4{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer number : ");
    int num = in.nextInt();
    System.out.println(" ");
    if(num%5==0  && num%7==0 ){
      System.out.println("yes! your entered number is divisible by both 5 and 7");
    }
    else{
      if(num%5==0){
        System.out.println("no, your entered number is only divisible by 5" );
      }
      else if(num%7==0){
        System.out.println("no, your entered number is only divisible by 7" );
      }
      else{
        System.out.println("nope, your entered number is not divisible by  5 or 7"  );
      }
      
    }
    
  }
  
}