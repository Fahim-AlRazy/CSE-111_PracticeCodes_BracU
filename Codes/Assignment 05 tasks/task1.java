import java.util.Scanner;
public class task1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer N : ");
    int N=sc.nextInt();
    while(N<0){
      System.out.print("Your input is negative . \nPlease Enter a positive integer N : ");
      N=sc.nextInt();
    }
    int paisi=0;
    for(int i=2;paisi!=N;i++){
      int count=0;
      for(int j=2;j<i;j++){
        if(i%j==0){
          count++;
        }
      }
      if(count==0){
        System.out.println(i);
        paisi++;
      }
    }  
  }
}