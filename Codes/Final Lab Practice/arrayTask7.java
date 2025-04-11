import java.util.Scanner;
public class arrayTask7{
  public static boolean isPrime(int x){
    boolean flag=true;
    for(int i=2;i<x;i++){
      if(x%i==0){
        flag=false;
        break;
      }
    }
    return flag;
  }
  public static boolean isPerfect(int x){
    boolean flag=false;
    int sum=0;
    for(int i=1;i<x;i++){
      if(x%i==0){
        sum+=i;
      }
    }
    if(sum==x){
      flag=true;
    }
    return flag;
  }
  public static void main(String[] args){
    int arr[] = {6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};
    System.out.println("Prime Numbers : ");
    for(int i=0;i<arr.length;i++){
      if(isPrime(arr[i])){
        System.out.println(i+" : "+arr[i]);
      }
    }
    System.out.println("Perfect Numbers : ");
    for(int i=0;i<arr.length;i++){
      if(isPerfect(arr[i])){
        System.out.println(i+" : "+arr[i]);
      }
    }
  }
}