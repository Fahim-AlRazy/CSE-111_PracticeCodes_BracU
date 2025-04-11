import java.util.Scanner;
public class pattern11{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter line number : ");
    int line= sc.nextInt();
    for(int row=1;row<=line;row++){
      for(int gap=line-1;gap>=row;gap--){
      System.out.print(" ");
      }
      
      for(int col=1;col<=row;col++){
      System.out.print(" "+"*");
      }
      System.out.println();
    }
    
    for(int i=2;i<=line;i++){
      for(int j=2;j<=i;j++){
      System.out.print(" ");
      }
      for(int k=line;k>=i;k--){
            System.out.print(" "+"*");
      }
      System.out.println();
    } 
  }
}