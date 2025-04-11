import java.util.Scanner;
public class task8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the length of the array 1 : ");
    int n= sc.nextInt();
    int[] arr1= new int[n];
    System.out.println("Please enter the elements of the array 1 : ");
    for(int i=0;i<n;i++){
      arr1[i]= sc.nextInt();
    }
    System.out.print("Please enter the length of the array 2 : ");
    int m= sc.nextInt();
    int[] arr2= new int[m];
    System.out.println("Please enter the elements of the array 2 : ");
    for(int i=0;i<m;i++){
      arr2[i]= sc.nextInt();
    }
    int count=0;
    for(int i=0;i<m;i++){
      count=0;
      for(int j=0;j<n;j++){
        if(arr2[i]==arr1[j]){
        count++;
        }
      }
      if(count==0){
      System.out.println("Array 2 is not a subset of Array 1");
      break;
      }
      else if(i==(m-1) && count!=0){
      System.out.println("Array 2 is a subset of Array 1");
      }
    }
  }
}