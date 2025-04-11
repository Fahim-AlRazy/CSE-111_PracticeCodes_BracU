import java.util.Arrays;
import java.util.Scanner;
public class array_sorting{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the array size : ");
    int n=sc.nextInt();
    int[] arr1 = new int[n];
    for(int i=0;i<n;i++){
      arr1[i]=sc.nextInt();
    }
    Arrays.sort(arr1);
    System.out.println("Ascending");
    for(int i=0;i<n;i++){
      System.out.print(" "+arr1[i]);
    }
    System.out.println();
    System.out.println("Descending");
    for(int i=n-1;i>=0;i--){
      System.out.print(" "+arr1[i]);
    }
    
    System.out.println();
    
    String[] arr2=new String[n];
    System.out.println("Enter Names : ");
    for(int i=0;i<n;i++){
      arr2[i]=sc.nextLine();
    }
    Arrays.sort(arr2);
    System.out.println("Ascending");
    for(int i=0;i<n;i++){
      System.out.print(" "+arr2[i]);
    }
    
    System.out.println();
    System.out.println("Descending");
    for(int i=n-1;i>=0;i--){
      System.out.print(" "+arr2[i]);
    }
    
    
  }
}