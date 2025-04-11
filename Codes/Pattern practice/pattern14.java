import java.util.Scanner;
public class pattern14{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter line number : ");
    int line= sc.nextInt();
    int line2=line;
    for(int i=1;i<=line;i++){
      for(int j=1;j<=line;j++){
        if(j==i){
        System.out.print(" * ");
        }
        else if(i+j==line+1){
        System.out.print(" * ");
        }
        else{
        System.out.print("   ");
        }
      }
      System.out.println();
    } 
  }
}