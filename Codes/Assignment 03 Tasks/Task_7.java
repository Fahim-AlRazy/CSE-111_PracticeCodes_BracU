import java.util.Scanner;
public class Task_7{
  public static void main(String[] args){
    Scanner i = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int x = i.nextInt();
    int res;
    if (x < 0) {
      res = 2 * x;
    }
    else if (x >= 0 && x < 2) {
      res = x + 1;
    }
    else if (x >= 2 && x < 5) {
      res = x * x - 1;
    }
    else {
      res = 3 * x * x + 2;
    }
    System.out.print("Result is :  " + res);
  }
}