import java.util.Scanner;
public class pattern12{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter line number : ");
    int line= sc.nextInt();
    for(int i=1;i<=line;i++){
      for(int j=1;j<=line;j++){
        if(i==1 || i==line){
        System.out.print(" * ");
        }
        else if(j==1){
        System.out.print(" * ");
        }
        else if(j==line){
        System.out.print("  * ");
        }
        else{
        System.out.print("   ");
        }
      }
      System.out.println();
    } 
  }
}