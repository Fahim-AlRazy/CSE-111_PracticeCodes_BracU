import java.util.Scanner;
public class Task_13{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the 3 numbers : ");
    int a = input.nextInt() , b = input.nextInt() ,c = input.nextInt() ;
    if(a==b && b==c && a==c){
    System.out.print("  All numbers are equal  ");
    }
    else if(a!=b && b!=c && a!=c ){
    System.out.print("  All numbers are different ");
    }
    else if((a==b && b!=c) || (a==c && b!=c) || (b==c && a!=c)){
    System.out.print("  Neither all are equal or different ");
    }
    
    
  }
}