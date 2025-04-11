import java.util.Scanner;
public class array_prac{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  
  System.out.print("Enter the amount of numbers you want to calculate : ");
  int n=sc.nextInt();
  int[] num=new int[n];
  int c=0;
  for(int i = 1;i<=n;i++){
   System.out.print("Enter the "+i+"th number : ");
   num[c]=sc.nextInt();
   c++;
  }
  int sum=0;
  for(int i = 0;i<n;i++){
   sum=sum+num[i];
  }
  System.out.println("the sum of your inputted numbers is :"+sum);
  double avg = (double)sum/n;
    System.out.println("the average of your inputted numbers is :"+avg);
      System.out.println("the size of your array is :"+num.length);
  }
}