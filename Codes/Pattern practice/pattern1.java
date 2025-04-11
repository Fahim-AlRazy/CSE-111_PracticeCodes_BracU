import java.util.Scanner;
public class pattern1{
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
          System.out.println();
    
     for(int row =1;row<=line;row++){
      for(int col=1;col<=row;col++){
      
        if(col%2!=0){
        System.out.print(1);
        }
        else{
          System.out.print(0);
        }
      }
      System.out.println();
    }
  }
}