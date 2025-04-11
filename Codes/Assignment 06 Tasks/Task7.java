import java.util.Scanner;
public class Task7{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the first string , your input must be lowercase  : ");
    String str1 = sc.nextLine();
    System.out.print("Enter the second string , your input must be lowercase : ");
    String str2 = sc.nextLine();
    String now="",print="";
    int count1= 0,count2=0;
    for(int i = 0; i<str1.length();i++){
      count1=0;
      for(int j =0;j<str2.length();j++){
        if(str1.charAt(i)==str2.charAt(j)){
          count1++;
        }
      }
      if(count1==0){
        print=print+(char)str1.charAt(i);
      }
    }
    for(int i = 0; i<str2.length();i++){
      count2=0;
      for(int j =0;j<str1.length();j++){
        if(str2.charAt(i)==str1.charAt(j)){
          count2++;
        }
      }
      if(count2==0){
        print=print+(char)str2.charAt(i);
      }
    }
    System.out.println(print.toUpperCase());
  }
}