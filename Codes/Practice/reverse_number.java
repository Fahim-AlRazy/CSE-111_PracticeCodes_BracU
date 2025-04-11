import java.util.Scanner;
public class reverse_number{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    
   System.out.print("Enter a number :");
   int num = sc.nextInt();
   
   int temp = num ;
   int sum =0 , r=0;
   while(temp != 0){
   r=temp%10;
   sum=sum*10+r;
   temp=temp/10;
   }
   System.out.println("Reversed number is : "+sum);
  }
}