//Task_1(a)
import java.util.Scanner;
public class Task_1_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = 24;
    while(n>=-6){
      if(n==-6){
        System.out.println(n);
      }
      else{
        System.out.print(n + " , ");
      }
      n-=6;
    }
  }
}

