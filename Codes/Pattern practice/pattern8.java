import java.util.Scanner;
public class pattern8{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter line number : ");
    int line= sc.nextInt();
    for(int row =1;row<=line;row++){
      for(int gap=1;gap<=line-row;gap++){
      System.out.print("  ");
      }
      for(int col=1;col<=row;col++){
      System.out.print(col);
      }
      System.out.println();
    }
   
    System.out.println();
   
    for(int row =1;row<=line;row++){
      for(int gap=1;gap<=line-row;gap++){
      System.out.print("  ");
      }
      for(int col=1;col<=row;col++){
      System.out.print(row);
      }
      System.out.println();
    }
  }
}