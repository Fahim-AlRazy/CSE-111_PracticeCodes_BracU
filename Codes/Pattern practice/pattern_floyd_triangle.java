import java.util.Scanner;
public class pattern_floyd_triangle{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter line number : ");
    int line= sc.nextInt();
    int count =1;
    for(int i=1;i<=line;i++){
      for(int j=1;j<=i;j++){  
        System.out.print(" "+count);
        count++;
      } 
      System.out.println();
    } 
  }
}