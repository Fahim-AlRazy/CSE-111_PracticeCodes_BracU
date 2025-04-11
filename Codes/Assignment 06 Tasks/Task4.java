import java.util.Scanner;
public class Task4{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter anything : ");
    String input = sc.nextLine();
    String reverse="";
    for(int i = input.length()-1;i>=0;i--){
      reverse+= input.charAt(i);
    }
    System.out.println(reverse);
  }
}