import java.util.Scanner;
public class without_function1{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a and b ");
   int a = sc.nextInt() , b= sc.nextInt(); // a to the power b 
   int power=1;
   for(int i =1;i<=b;i++){
     power=power*a;
   }
   System.out.println("The power value is : "+power);
    
  }
}