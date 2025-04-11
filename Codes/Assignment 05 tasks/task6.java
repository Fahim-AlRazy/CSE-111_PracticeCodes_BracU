import java.util.Scanner;
public class task6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the height of a right-justified right triangle : ");
    int line=sc.nextInt();
    
    for(int row =1;row<=line;row++){
      for(int gap=line-1;gap>=row;gap--){
        System.out.print("   ");
      }
      for(int col=1;col<=row;col++){
        System.out.print(col+" ");
      }
      System.out.println();
      System.out.println();   // qs 5 , 6 and 7 dekhe mone hoise 5 and 6 e majhkhane akta line gap ase 
    }
    
  }
}