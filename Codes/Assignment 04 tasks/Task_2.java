//Task_2
import java.util.Scanner;
public class Task_2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of inputs.");
    int N = sc.nextInt();   // in the question there is mentioned that N should be taken as input  
    int sum =0;
    System.out.print("Input the "+N+" numbers :");
    for(int i=1;i<=N;i++){ 
      int n = sc.nextInt();
      sum+= n;
    }
    System.out.println("The sum of "+N+" number is : " +sum);
    double avg = sum/N;
    System.out.println("The Average is : " + avg);
  }
}