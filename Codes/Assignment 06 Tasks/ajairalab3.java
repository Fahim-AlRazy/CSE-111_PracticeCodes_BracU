import java.util.Scanner;
public class ajairalab3{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  
  System.out.print("Enter anything : ");
  String str= sc.nextLine();
  
  System.out.print("What should be used to split :");
  String splt= sc.nextLine();
  
  for(int i =0;i<str.length();i++){
    
    if(str.charAt(i)==splt.charAt(0)){
    System.out.println();
    }
    
    else{
    System.out.print(str.charAt(i));
    }
  
  }
  System.out.println();
  }
}