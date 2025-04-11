import java.util.Scanner;
public class prime_number{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number which you want to check whether it is a prime or not \n N : ");
    int N=sc.nextInt();
    int count=0;
    for(int i =2;i<N;i++){
      if(N%i==0){
      count++;
      }
    }
    if(count==0){
      System.out.println(N+" is a prime number");
    }
    else{
    System.out.println(N+" is not a prime number");
    }
    

  
  }
}