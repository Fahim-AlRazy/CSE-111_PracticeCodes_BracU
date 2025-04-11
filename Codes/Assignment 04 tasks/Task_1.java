import java.util.Scanner;
public class Task_1{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a = 0;
  int sum =0 ;
    while(true){
      if(a>=0){
        sum=sum+a;
      System.out.print("Enter a positive integer number");
            a = sc.nextInt();    
      }
      else{
        System.out.println("Negative input");
          System.out.println("Total  = "+sum);
      break;
      }
    }
  }
  }
