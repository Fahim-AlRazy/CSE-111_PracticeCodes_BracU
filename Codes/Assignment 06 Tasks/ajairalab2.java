import java.util.Scanner;
public class ajairalab2{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter anything : ");
    String str= sc.nextLine();
   String reserve ="";
    for(int i= str.length() -1;i>=0;i--){
    reserve=reserve+str.charAt(i);
    }
    if(reserve.equals(str)){
    System.out.println("true");
        System.out.println(str+"----"+reserve);
    }
    else{
    System.out.println("false");
            System.out.println(str+"----"+reserve);
    }
  }  
}