import java.util.Scanner;
public class Task1{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter anything : ");
    String str = sc.nextLine();
    String print = "" ;
    int now=0 ;
    for(int idx =0;idx<str.length();idx++){
      now= (int) str.charAt(idx);
      if(now>=97 && now<=122){
        now=now-32;
      }
      print = print + (char)now;
    }
    System.out.println(print);
  }
}