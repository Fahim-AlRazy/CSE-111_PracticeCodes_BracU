import java.util.Scanner;
public class ten_numbers_max_min{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
   System.out.print("Enter a number : ");
   int num = sc.nextInt(),fibo=1;
   while(fibo<=num){
   System.out.print(" "+fibo);
   fibo=fibo+fibo;
   }
   
  
  }
}