import java.util.Scanner;
public class Task_5{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);  
    System.out.print("Enter a year : ");
    int year = in.nextInt();   
    
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
      System.out.print( year + " is a leap year ");
    }
    else{
      System.out.print( year + " is not a leap year ");
    }
  }
}