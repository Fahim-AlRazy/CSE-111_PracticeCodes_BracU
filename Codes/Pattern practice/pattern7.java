import java.util.Scanner;
public class pattern7{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter line number : ");
    int line= sc.nextInt();
    for(int row=1;row<=line;row++){
      for(int gap=line-1;gap>=row;gap--){
      System.out.print("  ");
      }
      
      for(int col=1;col<=row;col++){
      System.out.print(col+"  ");
      }
      System.out.println();
    }
          System.out.println();
                System.out.println();
                
     for(int row=1;row<=line;row++){
      for(int gap=line-1;gap>=row;gap--){
      System.out.print("  ");
      }
      
      for(int col=1;col<=row;col++){
      System.out.print(col);
      }
      
      for(int x=1;x<row;x++){
      System.out.print(x);
      }
      System.out.println();
    }
  }
}