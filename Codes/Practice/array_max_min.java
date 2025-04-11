import java.util.Scanner;
public class array_max_min{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
    System.out.print("Enter the amount of numbers you want to calculate : ");
    int n=sc.nextInt();
    int[] num = new int[n];
    int c=0;
  for(int i = 1;i<=n;i++){
   System.out.print("Enter the "+i+"th number : ");
   num[c]=sc.nextInt();
   c++;
  }
  int max=0 , min=0;
  for(int j =0;j<n;j++){
    if(num[j]>max){
    max=num[j];
    }
    if(num[j]<min){
    min=num[j];
    }
  }
  System.out.println("Maximum number is "+max+" and minimum number is "+min);
  }
}