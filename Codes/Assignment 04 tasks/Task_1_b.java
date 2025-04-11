//Task_1(b)
import java.util.Scanner;
public class Task_1_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    int n = -10;
    while(n<=20){ 
      if(n==20){
        System.out.println(n);
      }
      else{
        System.out.print(n + " , ");
      }
      n+=5;
    }
  }
}