import java.util.Scanner;
public class Task8{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a sentence : ");
    String str = sc.nextLine();
    String print= "";
    for(int i =0;i<str.length();i++){
      if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122)){
        if(i==0 && str.charAt(i)>=65 && str.charAt(i)<=90){
          print = print+ (char)(str.charAt(i)+32);
          continue;
        } 
        else if(i==0 && str.charAt(i)>=97 && str.charAt(i)<=122){
          print = print+ (char)str.charAt(i);
          continue;
        }
        if(i%2!=0 && str.charAt(i)>=65 && str.charAt(i)<=90){
          print = print+ (char)str.charAt(i);
          continue;
        }
        else if (i%2!=0 && str.charAt(i)>=97 && str.charAt(i)<=122){
          print = print+ (char)(str.charAt(i)-32);
          continue;
        }
        if(i%2==0 && str.charAt(i)>=65 && str.charAt(i)<=90){
          print = print+ (char)(str.charAt(i)+32);
          continue;
        }
        else if (i%2==0 && str.charAt(i)>=97 && str.charAt(i)<=122){
          print = print+ (char)str.charAt(i);
          continue;
        }
      }
      else{
        print=print+(char)str.charAt(i);
        i++;
      }
    }
    System.out.println(print);
  }
}