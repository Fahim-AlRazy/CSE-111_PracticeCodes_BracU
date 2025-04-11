import java.util.Scanner;
public class task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of an array : ");
    int n = sc.nextInt();
    int[] arr1= new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter a number : ");
      arr1[i]= sc.nextInt();
    }
    int[] arr2= new int[n];
    for(int i=0;i<n;i++){
      arr2[i]=arr1[(n-1)-i];
    }
    System.out.println("Reversed using a new array :");
    for(int i=0;i<n;i++){
      System.out.print(arr2[i]+" ");
    }
    int a=0,b=0;
    for(int i=0;i<(n/2);i++){
      a=arr1[i];
      b=arr1[(n-1)-i];
      arr1[i]=b;
      arr1[(n-1)-i]=a;
    }
    System.out.println();
    System.out.println("Reversed the original array :");
    for(int i=0;i<n;i++){
      System.out.print(arr1[i]+" ");
    }
    
    
    
    
  }
}