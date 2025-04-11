import java.util.Scanner;
public class pattern9{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter line number : ");
    int line= sc.nextInt();
    for(int row =1;row<=line;row++){
      for(int gap=line;gap>row;gap--){
        System.out.print("  ");
      }
      for(int col=1;col<=row;col++){
        System.out.print(col);
      }
      System.out.println();
    }
   
    System.out.println();
    
    for(int row =1;row<=line;row++){
      for(int gap=line;gap>row;gap--){
        System.out.print("  ");
      }
      for(int col=1;col<=row;col++){
        System.out.print(col);
      }
      System.out.println();
    }
   
    for(int row =line-1;row>0;row--){
      for(int gap=line;gap>row;gap--){
        System.out.print("  ");
      }
      for(int col=1;col<=row;col++){
        System.out.print(col);
      }
      System.out.println();
    }
    
    
  }
}