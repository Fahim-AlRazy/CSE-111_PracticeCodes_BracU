import java.util.Scanner;
public class ajairalab4{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter anything : ");
    String str= sc.nextLine();
    for(int i=(int)str.length() -1;i>=0;i--){
   // int now=str.charAt(i);
   // System.out.print((char)now);
      System.out.print(str.charAt(i));
    }
  }  
}