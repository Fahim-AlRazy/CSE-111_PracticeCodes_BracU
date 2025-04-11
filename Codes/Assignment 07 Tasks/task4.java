import java.util.Scanner;
public class task4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N : ");
    int n = sc.nextInt();
    int[] arr1= new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter a number : ");
      arr1[i]= sc.nextInt();
    }
    System.out.println("Original array : ");
    for(int i=0;i<n;i++){
      System.out.print(arr1[i]+" ");
    }
    for(int i=0;i<n;i++){
      if(arr1[i]>0){
        arr1[i]=1;
      }
      else if(arr1[i]<0){
        arr1[i]=0;
      } 
    }
    System.out.println();
    System.out.println("After modifying : ");
    for(int i=0;i<n;i++){
      System.out.print(arr1[i]+" ");
    }
    
    
  }
}