//1+3+5+n
import java.util.Scanner;
public class series_2{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int n = sc.nextInt();
  int i =1;
    while(i<=n){
      if(i==n){
      System.out.print(i);
      }
      else{
      System.out.print(i+", ");
      }
    i+=2;
  }
  }
}