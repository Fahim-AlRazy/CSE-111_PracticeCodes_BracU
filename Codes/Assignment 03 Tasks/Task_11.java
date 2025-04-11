import java.util.Scanner;
public class Task_11{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the 3 sides of your triangle : ");
    int a = input.nextInt() , b = input.nextInt() ,c = input.nextInt() ;
    if(a==b && b==c && a==c){
    System.out.print("  This is a Equilateral triangle  ");
    }
    else if(a!=b && b!=c && a!=c ){
    System.out.print("  This is a Scalene triangle ");
    }
    else if((a==b && b!=c) || (a==c && b!=c) || (b==c && a!=c)){
    System.out.print("  This is a Isosceles triangle ");
    }
    
  }
}