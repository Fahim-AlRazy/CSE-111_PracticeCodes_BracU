import java.util.Scanner;
public class pattern6{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter line number : ");
    int line= sc.nextInt();
    for(int row =1;row<=line;row++){
      for(int col=1;col<=row;col++){
      System.out.print(col);
      }
      System.out.println();
    }
    
    for(int row =line-1;row>0;row--){
      for(int col=1;col<=row;col++){
      System.out.print(col);
      }
      System.out.println();
    }
    System.out.println();
    
    String out ="*";
    for(int row =1;row<=line;row++){
      for(int col=1;col<=row;col++){
      System.out.print(" "+out);
      }
      System.out.println();
    } 
     for(int row =line-1;row>0;row--){
      for(int col=1;col<=row;col++){
      System.out.print(" "+out);
      }
      System.out.println();
    }
  }
}