import java.util.Scanner;
public class methodTask3{
  public static boolean isPrime(int x){ // isPrime 
    boolean flag ;
    int count=0;
    for(int i=2;i<x;i++){
      if(x%i==0){
        count++;
      }
    }
    if(count==0){
      flag=true;
    }
    else{
      flag=false;
    }
    return flag;
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number to check whether it is a prime or not :");
    int n= sc.nextInt();
    boolean check =isPrime(n);
    System.out.println(check);
  }
}