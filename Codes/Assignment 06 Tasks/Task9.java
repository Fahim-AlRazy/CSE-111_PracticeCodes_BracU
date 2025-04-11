import java.util.Scanner;
public class Task9{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a password : ");
    String pass = sc.nextLine();
    int upper=0,lower=0,digit=0,special=0;
    if(pass.length()<8){    //character count check
      System.out.println("False");
    }
    else{
      for(int i =0;i<pass.length();i++){
        if(pass.charAt(i)>=65 && pass.charAt(i)<=90){  // upper check
          upper++;
        }
        else if(pass.charAt(i)>=97 && pass.charAt(i)<=122){  // lower check
          lower++;
        }
        else if(pass.charAt(i)>=48 && pass.charAt(i)<=57){  // digit check
          digit++;
        }
        else{
          special++;
        }
      }
      if(upper>0 && lower>0 && digit>0 && special>0){    // final result 
        System.out.println("True");
      }
      else{
        System.out.println("False");
      }
    }
  }
}