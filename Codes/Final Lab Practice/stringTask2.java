import java.util.Scanner;
public class stringTask2{
  public static String modifyStrings( String s,String s1,String s2){
    String S=s.replace(s1,s2);
    return S;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three strings respectively :");
    String s=sc.next() , s1=sc.next() , s2=sc.next();
    String S=modifyStrings(s,s1,s2);
    System.out.println(S);
  }
}