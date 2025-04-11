//Task_6
import java.util.Scanner;
public class Task_6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number of terms:");
    int term = sc.nextInt() , i=1 , count =0 , sum =0 ;
    System.out.println("The odd numbers are : ");
    while(true){
      if(i%2!=0){
        count++;
        System.out.println(i);
        sum+=i;
      }
      i++;
      if(count==term){
        break;
      }
    }
    System.out.println("The Sum of odd Natural Numbers up to "+term+" terms is: "+sum);
    
    
  }
}