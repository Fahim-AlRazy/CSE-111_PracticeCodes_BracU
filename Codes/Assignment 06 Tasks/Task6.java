import java.util.Scanner;
public class Task6{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter anything : ");
    String str = sc.nextLine();
    String word="",reverse="";
    char split = ' ';
    for(int i=str.length()-1;i>=0;i--){  
      if(str.charAt(i)==split){
      reverse=reverse+word+split;
      word="";
      }
        else{
          word=str.charAt(i) + word;           
        }
    }
    reverse+=word;
    System.out.println(reverse);
  }
}

